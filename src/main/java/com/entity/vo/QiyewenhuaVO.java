package com.entity.vo;

import com.entity.QiyewenhuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 企业文化
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-01-29 11:14:25
 */
public class QiyewenhuaVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 视频简介
	 */
	
	private String shipinjianjie;
		
	/**
	 * 企业文化
	 */
	
	private String qiyewenhua;
		
	/**
	 * 发展历史
	 */
	
	private String fazhanlishi;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 邮箱
	 */
	
	private String youxiang;
		
	/**
	 * 详细地址
	 */
	
	private String xiangxidizhi;
				
	
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
	 * 设置：视频简介
	 */
	 
	public void setShipinjianjie(String shipinjianjie) {
		this.shipinjianjie = shipinjianjie;
	}
	
	/**
	 * 获取：视频简介
	 */
	public String getShipinjianjie() {
		return shipinjianjie;
	}
				
	
	/**
	 * 设置：企业文化
	 */
	 
	public void setQiyewenhua(String qiyewenhua) {
		this.qiyewenhua = qiyewenhua;
	}
	
	/**
	 * 获取：企业文化
	 */
	public String getQiyewenhua() {
		return qiyewenhua;
	}
				
	
	/**
	 * 设置：发展历史
	 */
	 
	public void setFazhanlishi(String fazhanlishi) {
		this.fazhanlishi = fazhanlishi;
	}
	
	/**
	 * 获取：发展历史
	 */
	public String getFazhanlishi() {
		return fazhanlishi;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
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
	 * 设置：详细地址
	 */
	 
	public void setXiangxidizhi(String xiangxidizhi) {
		this.xiangxidizhi = xiangxidizhi;
	}
	
	/**
	 * 获取：详细地址
	 */
	public String getXiangxidizhi() {
		return xiangxidizhi;
	}
			
}
