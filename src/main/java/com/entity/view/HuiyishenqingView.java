package com.entity.view;

import com.entity.HuiyishenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 会议申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-02 17:13:56
 */
@TableName("huiyishenqing")
public class HuiyishenqingView  extends HuiyishenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuiyishenqingView(){
	}
 
 	public HuiyishenqingView(HuiyishenqingEntity huiyishenqingEntity){
 	try {
			BeanUtils.copyProperties(this, huiyishenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
