package com.entity.view;

import com.entity.FeipinleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 废品类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-06-03 22:03:27
 */
@TableName("feipinleixing")
public class FeipinleixingView  extends FeipinleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FeipinleixingView(){
	}
 
 	public FeipinleixingView(FeipinleixingEntity feipinleixingEntity){
 	try {
			BeanUtils.copyProperties(this, feipinleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
