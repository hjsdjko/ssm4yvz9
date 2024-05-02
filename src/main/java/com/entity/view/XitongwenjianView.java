package com.entity.view;

import com.entity.XitongwenjianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 系统文件
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-02 17:13:56
 */
@TableName("xitongwenjian")
public class XitongwenjianView  extends XitongwenjianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XitongwenjianView(){
	}
 
 	public XitongwenjianView(XitongwenjianEntity xitongwenjianEntity){
 	try {
			BeanUtils.copyProperties(this, xitongwenjianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
