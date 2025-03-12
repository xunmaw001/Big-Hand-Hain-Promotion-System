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
 * 合作信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-01-29 11:14:25
 */
@TableName("hezuoxinxi")
public class HezuoxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HezuoxinxiEntity() {
		
	}
	
	public HezuoxinxiEntity(T t) {
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
	 * 名称
	 */
					
	private String mingcheng;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 合作公司
	 */
					
	private String hezuogongsi;
	
	/**
	 * 联系方式
	 */
					
	private String lianxifangshi;
	
	/**
	 * 邮箱
	 */
					
	private String youxiang;
	
	/**
	 * 合作结果
	 */
					
	private String hezuojieguo;
	
	/**
	 * 公司资源
	 */
					
	private String gongsiziyuan;
	
	/**
	 * 合作简述
	 */
					
	private String hezuojianshu;
	
	/**
	 * 合作日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date hezuoriqi;
	
	
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
	 * 设置：名称
	 */
	public void setMingcheng(String mingcheng) {
		this.mingcheng = mingcheng;
	}
	/**
	 * 获取：名称
	 */
	public String getMingcheng() {
		return mingcheng;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：合作公司
	 */
	public void setHezuogongsi(String hezuogongsi) {
		this.hezuogongsi = hezuogongsi;
	}
	/**
	 * 获取：合作公司
	 */
	public String getHezuogongsi() {
		return hezuogongsi;
	}
	/**
	 * 设置：联系方式
	 */
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
	/**
	 * 设置：邮箱
	 */
	public void setYouxiang(String youxiang) {
		this.youxiang = youxiang;
	}
	/**
	 * 获取：邮箱
	 */
	public String getYouxiang() {
		return youxiang;
	}
	/**
	 * 设置：合作结果
	 */
	public void setHezuojieguo(String hezuojieguo) {
		this.hezuojieguo = hezuojieguo;
	}
	/**
	 * 获取：合作结果
	 */
	public String getHezuojieguo() {
		return hezuojieguo;
	}
	/**
	 * 设置：公司资源
	 */
	public void setGongsiziyuan(String gongsiziyuan) {
		this.gongsiziyuan = gongsiziyuan;
	}
	/**
	 * 获取：公司资源
	 */
	public String getGongsiziyuan() {
		return gongsiziyuan;
	}
	/**
	 * 设置：合作简述
	 */
	public void setHezuojianshu(String hezuojianshu) {
		this.hezuojianshu = hezuojianshu;
	}
	/**
	 * 获取：合作简述
	 */
	public String getHezuojianshu() {
		return hezuojianshu;
	}
	/**
	 * 设置：合作日期
	 */
	public void setHezuoriqi(Date hezuoriqi) {
		this.hezuoriqi = hezuoriqi;
	}
	/**
	 * 获取：合作日期
	 */
	public Date getHezuoriqi() {
		return hezuoriqi;
	}

}
