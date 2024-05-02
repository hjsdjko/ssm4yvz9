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

import com.entity.ZichanzhejiuEntity;
import com.entity.view.ZichanzhejiuView;

import com.service.ZichanzhejiuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 资产折旧
 * 后端接口
 * @author 
 * @email 
 * @date 2021-05-02 17:13:56
 */
@RestController
@RequestMapping("/zichanzhejiu")
public class ZichanzhejiuController {
    @Autowired
    private ZichanzhejiuService zichanzhejiuService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZichanzhejiuEntity zichanzhejiu, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xiangmuguanli")) {
			zichanzhejiu.setGuanlizhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZichanzhejiuEntity> ew = new EntityWrapper<ZichanzhejiuEntity>();
		PageUtils page = zichanzhejiuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zichanzhejiu), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZichanzhejiuEntity zichanzhejiu, 
		HttpServletRequest request){
        EntityWrapper<ZichanzhejiuEntity> ew = new EntityWrapper<ZichanzhejiuEntity>();
		PageUtils page = zichanzhejiuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zichanzhejiu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZichanzhejiuEntity zichanzhejiu){
       	EntityWrapper<ZichanzhejiuEntity> ew = new EntityWrapper<ZichanzhejiuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zichanzhejiu, "zichanzhejiu")); 
        return R.ok().put("data", zichanzhejiuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZichanzhejiuEntity zichanzhejiu){
        EntityWrapper< ZichanzhejiuEntity> ew = new EntityWrapper< ZichanzhejiuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zichanzhejiu, "zichanzhejiu")); 
		ZichanzhejiuView zichanzhejiuView =  zichanzhejiuService.selectView(ew);
		return R.ok("查询资产折旧成功").put("data", zichanzhejiuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZichanzhejiuEntity zichanzhejiu = zichanzhejiuService.selectById(id);
        return R.ok().put("data", zichanzhejiu);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZichanzhejiuEntity zichanzhejiu = zichanzhejiuService.selectById(id);
        return R.ok().put("data", zichanzhejiu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZichanzhejiuEntity zichanzhejiu, HttpServletRequest request){
    	zichanzhejiu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zichanzhejiu);

        zichanzhejiuService.insert(zichanzhejiu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZichanzhejiuEntity zichanzhejiu, HttpServletRequest request){
    	zichanzhejiu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zichanzhejiu);

        zichanzhejiuService.insert(zichanzhejiu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ZichanzhejiuEntity zichanzhejiu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zichanzhejiu);
        zichanzhejiuService.updateById(zichanzhejiu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zichanzhejiuService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<ZichanzhejiuEntity> wrapper = new EntityWrapper<ZichanzhejiuEntity>();
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

		int count = zichanzhejiuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
