package com.entity.model;

import com.entity.DanganxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 档案信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-02 17:13:56
 */
public class DanganxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 档案类型
	 */
	
	private String danganleixing;
		
	/**
	 * 档案内容
	 */
	
	private String danganneirong;
		
	/**
	 * 档案文件
	 */
	
	private String danganwenjian;
		
	/**
	 * 填报人
	 */
	
	private String tianbaoren;
		
	/**
	 * 录入时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date lurushijian;
		
	/**
	 * 管理账号
	 */
	
	private String guanlizhanghao;
		
	/**
	 * 管理姓名
	 */
	
	private String guanlixingming;
				
	
	/**
	 * 设置：档案类型
	 */
	 
	public void setDanganleixing(String danganleixing) {
		this.danganleixing = danganleixing;
	}
	
	/**
	 * 获取：档案类型
	 */
	public String getDanganleixing() {
		return danganleixing;
	}
				
	
	/**
	 * 设置：档案内容
	 */
	 
	public void setDanganneirong(String danganneirong) {
		this.danganneirong = danganneirong;
	}
	
	/**
	 * 获取：档案内容
	 */
	public String getDanganneirong() {
		return danganneirong;
	}
				
	
	/**
	 * 设置：档案文件
	 */
	 
	public void setDanganwenjian(String danganwenjian) {
		this.danganwenjian = danganwenjian;
	}
	
	/**
	 * 获取：档案文件
	 */
	public String getDanganwenjian() {
		return danganwenjian;
	}
				
	
	/**
	 * 设置：填报人
	 */
	 
	public void setTianbaoren(String tianbaoren) {
		this.tianbaoren = tianbaoren;
	}
	
	/**
	 * 获取：填报人
	 */
	public String getTianbaoren() {
		return tianbaoren;
	}
				
	
	/**
	 * 设置：录入时间
	 */
	 
	public void setLurushijian(Date lurushijian) {
		this.lurushijian = lurushijian;
	}
	
	/**
	 * 获取：录入时间
	 */
	public Date getLurushijian() {
		return lurushijian;
	}
				
	
	/**
	 * 设置：管理账号
	 */
	 
	public void setGuanlizhanghao(String guanlizhanghao) {
		this.guanlizhanghao = guanlizhanghao;
	}
	
	/**
	 * 获取：管理账号
	 */
	public String getGuanlizhanghao() {
		return guanlizhanghao;
	}
				
	
	/**
	 * 设置：管理姓名
	 */
	 
	public void setGuanlixingming(String guanlixingming) {
		this.guanlixingming = guanlixingming;
	}
	
	/**
	 * 获取：管理姓名
	 */
	public String getGuanlixingming() {
		return guanlixingming;
	}
			
}
