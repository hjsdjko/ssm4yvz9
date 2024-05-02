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

import com.entity.HuiyishenqingEntity;
import com.entity.view.HuiyishenqingView;

import com.service.HuiyishenqingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 会议申请
 * 后端接口
 * @author 
 * @email 
 * @date 2021-05-02 17:13:56
 */
@RestController
@RequestMapping("/huiyishenqing")
public class HuiyishenqingController {
    @Autowired
    private HuiyishenqingService huiyishenqingService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,HuiyishenqingEntity huiyishenqing, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xiangmuguanli")) {
			huiyishenqing.setGuanlizhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			huiyishenqing.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<HuiyishenqingEntity> ew = new EntityWrapper<HuiyishenqingEntity>();
		PageUtils page = huiyishenqingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huiyishenqing), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,HuiyishenqingEntity huiyishenqing, 
		HttpServletRequest request){
        EntityWrapper<HuiyishenqingEntity> ew = new EntityWrapper<HuiyishenqingEntity>();
		PageUtils page = huiyishenqingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huiyishenqing), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( HuiyishenqingEntity huiyishenqing){
       	EntityWrapper<HuiyishenqingEntity> ew = new EntityWrapper<HuiyishenqingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( huiyishenqing, "huiyishenqing")); 
        return R.ok().put("data", huiyishenqingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(HuiyishenqingEntity huiyishenqing){
        EntityWrapper< HuiyishenqingEntity> ew = new EntityWrapper< HuiyishenqingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( huiyishenqing, "huiyishenqing")); 
		HuiyishenqingView huiyishenqingView =  huiyishenqingService.selectView(ew);
		return R.ok("查询会议申请成功").put("data", huiyishenqingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        HuiyishenqingEntity huiyishenqing = huiyishenqingService.selectById(id);
        return R.ok().put("data", huiyishenqing);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        HuiyishenqingEntity huiyishenqing = huiyishenqingService.selectById(id);
        return R.ok().put("data", huiyishenqing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HuiyishenqingEntity huiyishenqing, HttpServletRequest request){
    	huiyishenqing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(huiyishenqing);

        huiyishenqingService.insert(huiyishenqing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody HuiyishenqingEntity huiyishenqing, HttpServletRequest request){
    	huiyishenqing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(huiyishenqing);

        huiyishenqingService.insert(huiyishenqing);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody HuiyishenqingEntity huiyishenqing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(huiyishenqing);
        huiyishenqingService.updateById(huiyishenqing);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        huiyishenqingService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<HuiyishenqingEntity> wrapper = new EntityWrapper<HuiyishenqingEntity>();
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

		int count = huiyishenqingService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
