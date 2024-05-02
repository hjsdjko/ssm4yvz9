package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.YuangongfawenEntity;
import com.entity.view.YuangongfawenView;

import com.service.YuangongfawenService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 员工发文
 * 后端接口
 * @author 
 * @email 
 * @date 2021-05-02 17:13:56
 */
@RestController
@RequestMapping("/yuangongfawen")
public class YuangongfawenController {
    @Autowired
    private YuangongfawenService yuangongfawenService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YuangongfawenEntity yuangongfawen, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date faburiqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date faburiqiend,
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xiangmuguanli")) {
			yuangongfawen.setGuanlizhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			yuangongfawen.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YuangongfawenEntity> ew = new EntityWrapper<YuangongfawenEntity>();
                if(faburiqistart!=null) ew.ge("faburiqi", faburiqistart);
                if(faburiqiend!=null) ew.le("faburiqi", faburiqiend);
		PageUtils page = yuangongfawenService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yuangongfawen), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YuangongfawenEntity yuangongfawen, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date faburiqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date faburiqiend,
		HttpServletRequest request){
        EntityWrapper<YuangongfawenEntity> ew = new EntityWrapper<YuangongfawenEntity>();
                if(faburiqistart!=null) ew.ge("faburiqi", faburiqistart);
                if(faburiqiend!=null) ew.le("faburiqi", faburiqiend);
		PageUtils page = yuangongfawenService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yuangongfawen), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YuangongfawenEntity yuangongfawen){
       	EntityWrapper<YuangongfawenEntity> ew = new EntityWrapper<YuangongfawenEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yuangongfawen, "yuangongfawen")); 
        return R.ok().put("data", yuangongfawenService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YuangongfawenEntity yuangongfawen){
        EntityWrapper< YuangongfawenEntity> ew = new EntityWrapper< YuangongfawenEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yuangongfawen, "yuangongfawen")); 
		YuangongfawenView yuangongfawenView =  yuangongfawenService.selectView(ew);
		return R.ok("查询员工发文成功").put("data", yuangongfawenView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YuangongfawenEntity yuangongfawen = yuangongfawenService.selectById(id);
        return R.ok().put("data", yuangongfawen);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YuangongfawenEntity yuangongfawen = yuangongfawenService.selectById(id);
        return R.ok().put("data", yuangongfawen);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YuangongfawenEntity yuangongfawen, HttpServletRequest request){
    	yuangongfawen.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yuangongfawen);

        yuangongfawenService.insert(yuangongfawen);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YuangongfawenEntity yuangongfawen, HttpServletRequest request){
    	yuangongfawen.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yuangongfawen);

        yuangongfawenService.insert(yuangongfawen);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody YuangongfawenEntity yuangongfawen, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yuangongfawen);
        yuangongfawenService.updateById(yuangongfawen);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yuangongfawenService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<YuangongfawenEntity> wrapper = new EntityWrapper<YuangongfawenEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xiangmuguanli")) {
			wrapper.eq("guanlizhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = yuangongfawenService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
