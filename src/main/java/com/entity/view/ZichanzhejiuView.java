package com.entity.view;

import com.entity.ZichanzhejiuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 资产折旧
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-02 17:13:56
 */
@TableName("zichanzhejiu")
public class ZichanzhejiuView  extends ZichanzhejiuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZichanzhejiuView(){
	}
 
 	public ZichanzhejiuView(ZichanzhejiuEntity zichanzhejiuEntity){
 	try {
			BeanUtils.copyProperties(this, zichanzhejiuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
