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
 * 资产折旧
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-02 17:13:56
 */
@TableName("zichanzhejiu")
public class ZichanzhejiuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZichanzhejiuEntity() {
		
	}
	
	public ZichanzhejiuEntity(T t) {
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
	 * 编号
	 */
					
	private String bianhao;
	
	/**
	 * 资产名称
	 */
					
	private String zichanmingcheng;
	
	/**
	 * 规格
	 */
					
	private String guige;
	
	/**
	 * 购入金额
	 */
					
	private Integer gourujine;
	
	/**
	 * 购入日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date goururiqi;
	
	/**
	 * 折旧年限
	 */
					
	private String zhejiunianxian;
	
	/**
	 * 残值率
	 */
					
	private String canzhilv;
	
	/**
	 * 累计折旧
	 */
					
	private String leijizhejiu;
	
	/**
	 * 折旧余额
	 */
					
	private Integer zhejiuyue;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	/**
	 * 管理账号
	 */
					
	private String guanlizhanghao;
	
	/**
	 * 管理姓名
	 */
					
	private String guanlixingming;
	
	
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
	 * 设置：编号
	 */
	public void setBianhao(String bianhao) {
		this.bianhao = bianhao;
	}
	/**
	 * 获取：编号
	 */
	public String getBianhao() {
		return bianhao;
	}
	/**
	 * 设置：资产名称
	 */
	public void setZichanmingcheng(String zichanmingcheng) {
		this.zichanmingcheng = zichanmingcheng;
	}
	/**
	 * 获取：资产名称
	 */
	public String getZichanmingcheng() {
		return zichanmingcheng;
	}
	/**
	 * 设置：规格
	 */
	public void setGuige(String guige) {
		this.guige = guige;
	}
	/**
	 * 获取：规格
	 */
	public String getGuige() {
		return guige;
	}
	/**
	 * 设置：购入金额
	 */
	public void setGourujine(Integer gourujine) {
		this.gourujine = gourujine;
	}
	/**
	 * 获取：购入金额
	 */
	public Integer getGourujine() {
		return gourujine;
	}
	/**
	 * 设置：购入日期
	 */
	public void setGoururiqi(Date goururiqi) {
		this.goururiqi = goururiqi;
	}
	/**
	 * 获取：购入日期
	 */
	public Date getGoururiqi() {
		return goururiqi;
	}
	/**
	 * 设置：折旧年限
	 */
	public void setZhejiunianxian(String zhejiunianxian) {
		this.zhejiunianxian = zhejiunianxian;
	}
	/**
	 * 获取：折旧年限
	 */
	public String getZhejiunianxian() {
		return zhejiunianxian;
	}
	/**
	 * 设置：残值率
	 */
	public void setCanzhilv(String canzhilv) {
		this.canzhilv = canzhilv;
	}
	/**
	 * 获取：残值率
	 */
	public String getCanzhilv() {
		return canzhilv;
	}
	/**
	 * 设置：累计折旧
	 */
	public void setLeijizhejiu(String leijizhejiu) {
		this.leijizhejiu = leijizhejiu;
	}
	/**
	 * 获取：累计折旧
	 */
	public String getLeijizhejiu() {
		return leijizhejiu;
	}
	/**
	 * 设置：折旧余额
	 */
	public void setZhejiuyue(Integer zhejiuyue) {
		this.zhejiuyue = zhejiuyue;
	}
	/**
	 * 获取：折旧余额
	 */
	public Integer getZhejiuyue() {
		return zhejiuyue;
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
