package com.entity.view;

import com.entity.HuiyixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 会议信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-02 17:13:56
 */
@TableName("huiyixinxi")
public class HuiyixinxiView  extends HuiyixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuiyixinxiView(){
	}
 
 	public HuiyixinxiView(HuiyixinxiEntity huiyixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, huiyixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
