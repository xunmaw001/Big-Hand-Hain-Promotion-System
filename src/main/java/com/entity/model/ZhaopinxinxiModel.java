package com.entity.model;

import com.entity.ZhaopinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 招聘信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-01-29 11:14:25
 */
public class ZhaopinxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 招聘岗位
	 */
	
	private String zhaopingangwei;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 招聘人数
	 */
	
	private String zhaopinrenshu;
		
	/**
	 * 工资
	 */
	
	private String gongzi;
		
	/**
	 * 招聘要求
	 */
	
	private String zhaopinyaoqiu;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
				
	
	/**
	 * 设置：招聘岗位
	 */
	 
	public void setZhaopingangwei(String zhaopingangwei) {
		this.zhaopingangwei = zhaopingangwei;
	}
	
	/**
	 * 获取：招聘岗位
	 */
	public String getZhaopingangwei() {
		return zhaopingangwei;
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
	 * 设置：招聘人数
	 */
	 
	public void setZhaopinrenshu(String zhaopinrenshu) {
		this.zhaopinrenshu = zhaopinrenshu;
	}
	
	/**
	 * 获取：招聘人数
	 */
	public String getZhaopinrenshu() {
		return zhaopinrenshu;
	}
				
	
	/**
	 * 设置：工资
	 */
	 
	public void setGongzi(String gongzi) {
		this.gongzi = gongzi;
	}
	
	/**
	 * 获取：工资
	 */
	public String getGongzi() {
		return gongzi;
	}
				
	
	/**
	 * 设置：招聘要求
	 */
	 
	public void setZhaopinyaoqiu(String zhaopinyaoqiu) {
		this.zhaopinyaoqiu = zhaopinyaoqiu;
	}
	
	/**
	 * 获取：招聘要求
	 */
	public String getZhaopinyaoqiu() {
		return zhaopinyaoqiu;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
			
}
