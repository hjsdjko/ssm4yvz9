package com.entity.view;

import com.entity.YuangongfawenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 员工发文
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-02 17:13:56
 */
@TableName("yuangongfawen")
public class YuangongfawenView  extends YuangongfawenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuangongfawenView(){
	}
 
 	public YuangongfawenView(YuangongfawenEntity yuangongfawenEntity){
 	try {
			BeanUtils.copyProperties(this, yuangongfawenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
