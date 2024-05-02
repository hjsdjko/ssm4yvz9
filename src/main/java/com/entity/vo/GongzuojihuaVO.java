package com.entity.vo;

import com.entity.GongzuojihuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 工作计划
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-02 17:13:56
 */
public class GongzuojihuaVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 工作内容
	 */
	
	private String gongzuoneirong;
		
	/**
	 * 计划内容
	 */
	
	private String jihuaneirong;
		
	/**
	 * 计划方案
	 */
	
	private String jihuafangan;
		
	/**
	 * 预计结果
	 */
	
	private String yujijieguo;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
				
	
	/**
	 * 设置：工作内容
	 */
	 
	public void setGongzuoneirong(String gongzuoneirong) {
		this.gongzuoneirong = gongzuoneirong;
	}
	
	/**
	 * 获取：工作内容
	 */
	public String getGongzuoneirong() {
		return gongzuoneirong;
	}
				
	
	/**
	 * 设置：计划内容
	 */
	 
	public void setJihuaneirong(String jihuaneirong) {
		this.jihuaneirong = jihuaneirong;
	}
	
	/**
	 * 获取：计划内容
	 */
	public String getJihuaneirong() {
		return jihuaneirong;
	}
				
	
	/**
	 * 设置：计划方案
	 */
	 
	public void setJihuafangan(String jihuafangan) {
		this.jihuafangan = jihuafangan;
	}
	
	/**
	 * 获取：计划方案
	 */
	public String getJihuafangan() {
		return jihuafangan;
	}
				
	
	/**
	 * 设置：预计结果
	 */
	 
	public void setYujijieguo(String yujijieguo) {
		this.yujijieguo = yujijieguo;
	}
	
	/**
	 * 获取：预计结果
	 */
	public String getYujijieguo() {
		return yujijieguo;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
			
}
