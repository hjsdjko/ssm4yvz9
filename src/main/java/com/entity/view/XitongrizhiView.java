package com.entity.view;

import com.entity.XitongrizhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 系统日志
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-02 17:13:56
 */
@TableName("xitongrizhi")
public class XitongrizhiView  extends XitongrizhiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XitongrizhiView(){
	}
 
 	public XitongrizhiView(XitongrizhiEntity xitongrizhiEntity){
 	try {
			BeanUtils.copyProperties(this, xitongrizhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
