package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FeipinleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FeipinleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FeipinleixingView;


/**
 * 废品类型
 *
 * @author 
 * @email 
 * @date 2021-06-03 22:03:27
 */
public interface FeipinleixingService extends IService<FeipinleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FeipinleixingVO> selectListVO(Wrapper<FeipinleixingEntity> wrapper);
   	
   	FeipinleixingVO selectVO(@Param("ew") Wrapper<FeipinleixingEntity> wrapper);
   	
   	List<FeipinleixingView> selectListView(Wrapper<FeipinleixingEntity> wrapper);
   	
   	FeipinleixingView selectView(@Param("ew") Wrapper<FeipinleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FeipinleixingEntity> wrapper);
   	
}

