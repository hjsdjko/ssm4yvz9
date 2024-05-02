package com.entity.view;

import com.entity.YongpinshenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 用品申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-02 17:13:56
 */
@TableName("yongpinshenqing")
public class YongpinshenqingView  extends YongpinshenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YongpinshenqingView(){
	}
 
 	public YongpinshenqingView(YongpinshenqingEntity yongpinshenqingEntity){
 	try {
			BeanUtils.copyProperties(this, yongpinshenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
