package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 请假申请
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-02 17:13:56
 */
@TableName("qingjiashenqing")
public class QingjiashenqingEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public QingjiashenqingEntity() {
		
	}
	
	public QingjiashenqingEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 管理账号
	 */
					
	private String guanlizhanghao;
	
	/**
	 * 管理姓名
	 */
					
	private String guanlixingming;
	
	/**
	 * 请假类型
	 */
					
	private String qingjialeixing;
	
	/**
	 * 请假日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date qingjiariqi;
	
	/**
	 * 请假天数
	 */
					
	private Integer qingjiatianshu;
	
	/**
	 * 请假事由
	 */
					
	private String qingjiashiyou;
	
	/**
	 * 证明文件
	 */
					
	private String zhengmingwenjian;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	/**
	 * 部门
	 */
					
	private String bumen;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	/**
	 * 设置：请假类型
	 */
	public void setQingjialeixing(String qingjialeixing) {
		this.qingjialeixing = qingjialeixing;
	}
	/**
	 * 获取：请假类型
	 */
	public String getQingjialeixing() {
		return qingjialeixing;
	}
	/**
	 * 设置：请假日期
	 */
	public void setQingjiariqi(Date qingjiariqi) {
		this.qingjiariqi = qingjiariqi;
	}
	/**
	 * 获取：请假日期
	 */
	public Date getQingjiariqi() {
		return qingjiariqi;
	}
	/**
	 * 设置：请假天数
	 */
	public void setQingjiatianshu(Integer qingjiatianshu) {
		this.qingjiatianshu = qingjiatianshu;
	}
	/**
	 * 获取：请假天数
	 */
	public Integer getQingjiatianshu() {
		return qingjiatianshu;
	}
	/**
	 * 设置：请假事由
	 */
	public void setQingjiashiyou(String qingjiashiyou) {
		this.qingjiashiyou = qingjiashiyou;
	}
	/**
	 * 获取：请假事由
	 */
	public String getQingjiashiyou() {
		return qingjiashiyou;
	}
	/**
	 * 设置：证明文件
	 */
	public void setZhengmingwenjian(String zhengmingwenjian) {
		this.zhengmingwenjian = zhengmingwenjian;
	}
	/**
	 * 获取：证明文件
	 */
	public String getZhengmingwenjian() {
		return zhengmingwenjian;
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
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
