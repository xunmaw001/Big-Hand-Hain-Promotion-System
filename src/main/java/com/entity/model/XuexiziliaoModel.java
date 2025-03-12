package com.entity.model;

import com.entity.XuexiziliaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 学习资料
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-01-29 11:14:25
 */
public class XuexiziliaoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 学习资料
	 */
	
	private String xuexiziliao;
		
	/**
	 * 学习视频
	 */
	
	private String xuexishipin;
		
	/**
	 * 内容简介
	 */
	
	private String neirongjianjie;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
				
	
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
	 * 设置：学习资料
	 */
	 
	public void setXuexiziliao(String xuexiziliao) {
		this.xuexiziliao = xuexiziliao;
	}
	
	/**
	 * 获取：学习资料
	 */
	public String getXuexiziliao() {
		return xuexiziliao;
	}
				
	
	/**
	 * 设置：学习视频
	 */
	 
	public void setXuexishipin(String xuexishipin) {
		this.xuexishipin = xuexishipin;
	}
	
	/**
	 * 获取：学习视频
	 */
	public String getXuexishipin() {
		return xuexishipin;
	}
				
	
	/**
	 * 设置：内容简介
	 */
	 
	public void setNeirongjianjie(String neirongjianjie) {
		this.neirongjianjie = neirongjianjie;
	}
	
	/**
	 * 获取：内容简介
	 */
	public String getNeirongjianjie() {
		return neirongjianjie;
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
			
}
