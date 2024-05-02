package com.entity.view;

import com.entity.XiangmuguanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 项目管理
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-02 17:13:55
 */
@TableName("xiangmuguanli")
public class XiangmuguanliView  extends XiangmuguanliEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiangmuguanliView(){
	}
 
 	public XiangmuguanliView(XiangmuguanliEntity xiangmuguanliEntity){
 	try {
			BeanUtils.copyProperties(this, xiangmuguanliEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
