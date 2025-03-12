package com.entity.view;

import com.entity.QiyezhixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 企业之星
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-29 11:14:25
 */
@TableName("qiyezhixing")
public class QiyezhixingView  extends QiyezhixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QiyezhixingView(){
	}
 
 	public QiyezhixingView(QiyezhixingEntity qiyezhixingEntity){
 	try {
			BeanUtils.copyProperties(this, qiyezhixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
