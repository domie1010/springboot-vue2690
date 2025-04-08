package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FeipinxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FeipinxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FeipinxinxiView;


/**
 * 废品信息
 *
 * @author 
 * @email 
 * @date 2021-06-03 22:03:27
 */
public interface FeipinxinxiService extends IService<FeipinxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FeipinxinxiVO> selectListVO(Wrapper<FeipinxinxiEntity> wrapper);
   	
   	FeipinxinxiVO selectVO(@Param("ew") Wrapper<FeipinxinxiEntity> wrapper);
   	
   	List<FeipinxinxiView> selectListView(Wrapper<FeipinxinxiEntity> wrapper);
   	
   	FeipinxinxiView selectView(@Param("ew") Wrapper<FeipinxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FeipinxinxiEntity> wrapper);
   	
}

