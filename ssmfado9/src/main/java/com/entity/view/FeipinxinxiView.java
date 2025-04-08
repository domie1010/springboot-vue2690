package com.entity.view;

import com.entity.FeipinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 废品信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-06-03 22:03:27
 */
@TableName("feipinxinxi")
public class FeipinxinxiView  extends FeipinxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FeipinxinxiView(){
	}
 
 	public FeipinxinxiView(FeipinxinxiEntity feipinxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, feipinxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
