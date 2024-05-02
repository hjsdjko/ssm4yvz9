package com.entity.vo;

import com.entity.YuangongfawenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 员工发文
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-02 17:13:56
 */
public class YuangongfawenVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 管理姓名
	 */
	
	private String guanlixingming;
		
	/**
	 * 文件名称
	 */
	
	private String wenjianmingcheng;
		
	/**
	 * 文件内容
	 */
	
	private String wenjianneirong;
		
	/**
	 * 文件资料
	 */
	
	private String wenjianziliao;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 部门
	 */
	
	private String bumen;
				
	
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
				
	
	/**
	 * 设置：文件名称
	 */
	 
	public void setWenjianmingcheng(String wenjianmingcheng) {
		this.wenjianmingcheng = wenjianmingcheng;
	}
	
	/**
	 * 获取：文件名称
	 */
	public String getWenjianmingcheng() {
		return wenjianmingcheng;
	}
				
	
	/**
	 * 设置：文件内容
	 */
	 
	public void setWenjianneirong(String wenjianneirong) {
		this.wenjianneirong = wenjianneirong;
	}
	
	/**
	 * 获取：文件内容
	 */
	public String getWenjianneirong() {
		return wenjianneirong;
	}
				
	
	/**
	 * 设置：文件资料
	 */
	 
	public void setWenjianziliao(String wenjianziliao) {
		this.wenjianziliao = wenjianziliao;
	}
	
	/**
	 * 获取：文件资料
	 */
	public String getWenjianziliao() {
		return wenjianziliao;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
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
	 * 设置：部门
	 */
	 
	public void setBumen(String bumen) {
		this.bumen = bumen;
	}
	
	/**
	 * 获取：部门
	 */
	public String getBumen() {
		return bumen;
	}
			
}
