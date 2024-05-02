package com.entity.model;

import com.entity.GongsitushuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 公司图书
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-02 17:13:56
 */
public class GongsitushuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图书类型
	 */
	
	private String tushuleixing;
		
	/**
	 * 图书介绍
	 */
	
	private String tushujieshao;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 借阅说明
	 */
	
	private String jieyueshuoming;
		
	/**
	 * 登记日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjiriqi;
				
	
	/**
	 * 设置：图书类型
	 */
	 
	public void setTushuleixing(String tushuleixing) {
		this.tushuleixing = tushuleixing;
	}
	
	/**
	 * 获取：图书类型
	 */
	public String getTushuleixing() {
		return tushuleixing;
	}
				
	
	/**
	 * 设置：图书介绍
	 */
	 
	public void setTushujieshao(String tushujieshao) {
		this.tushujieshao = tushujieshao;
	}
	
	/**
	 * 获取：图书介绍
	 */
	public String getTushujieshao() {
		return tushujieshao;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：借阅说明
	 */
	 
	public void setJieyueshuoming(String jieyueshuoming) {
		this.jieyueshuoming = jieyueshuoming;
	}
	
	/**
	 * 获取：借阅说明
	 */
	public String getJieyueshuoming() {
		return jieyueshuoming;
	}
				
	
	/**
	 * 设置：登记日期
	 */
	 
	public void setDengjiriqi(Date dengjiriqi) {
		this.dengjiriqi = dengjiriqi;
	}
	
	/**
	 * 获取：登记日期
	 */
	public Date getDengjiriqi() {
		return dengjiriqi;
	}
			
}
