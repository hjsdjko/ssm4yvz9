package com.entity.vo;

import com.entity.HuiyixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 会议信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-02 17:13:56
 */
public class HuiyixinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 会议地点
	 */
	
	private String huiyididian;
		
	/**
	 * 房间号
	 */
	
	private String fangjianhao;
		
	/**
	 * 会议内容
	 */
	
	private String huiyineirong;
		
	/**
	 * 重要人员
	 */
	
	private String zhongyaorenyuan;
		
	/**
	 * 详情
	 */
	
	private String xiangqing;
		
	/**
	 * 开会时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date kaihuishijian;
		
	/**
	 * 管理账号
	 */
	
	private String guanlizhanghao;
		
	/**
	 * 管理姓名
	 */
	
	private String guanlixingming;
				
	
	/**
	 * 设置：会议地点
	 */
	 
	public void setHuiyididian(String huiyididian) {
		this.huiyididian = huiyididian;
	}
	
	/**
	 * 获取：会议地点
	 */
	public String getHuiyididian() {
		return huiyididian;
	}
				
	
	/**
	 * 设置：房间号
	 */
	 
	public void setFangjianhao(String fangjianhao) {
		this.fangjianhao = fangjianhao;
	}
	
	/**
	 * 获取：房间号
	 */
	public String getFangjianhao() {
		return fangjianhao;
	}
				
	
	/**
	 * 设置：会议内容
	 */
	 
	public void setHuiyineirong(String huiyineirong) {
		this.huiyineirong = huiyineirong;
	}
	
	/**
	 * 获取：会议内容
	 */
	public String getHuiyineirong() {
		return huiyineirong;
	}
				
	
	/**
	 * 设置：重要人员
	 */
	 
	public void setZhongyaorenyuan(String zhongyaorenyuan) {
		this.zhongyaorenyuan = zhongyaorenyuan;
	}
	
	/**
	 * 获取：重要人员
	 */
	public String getZhongyaorenyuan() {
		return zhongyaorenyuan;
	}
				
	
	/**
	 * 设置：详情
	 */
	 
	public void setXiangqing(String xiangqing) {
		this.xiangqing = xiangqing;
	}
	
	/**
	 * 获取：详情
	 */
	public String getXiangqing() {
		return xiangqing;
	}
				
	
	/**
	 * 设置：开会时间
	 */
	 
	public void setKaihuishijian(Date kaihuishijian) {
		this.kaihuishijian = kaihuishijian;
	}
	
	/**
	 * 获取：开会时间
	 */
	public Date getKaihuishijian() {
		return kaihuishijian;
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
