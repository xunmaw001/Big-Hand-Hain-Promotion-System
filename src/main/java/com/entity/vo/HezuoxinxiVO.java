package com.entity.vo;

import com.entity.HezuoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 合作信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-01-29 11:14:25
 */
public class HezuoxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date hezuoriqi;
				
	
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
