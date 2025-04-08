package com.dao;

import com.entity.FeipinxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FeipinxinxiVO;
import com.entity.view.FeipinxinxiView;


/**
 * 废品信息
 * 
 * @author 
 * @email 
 * @date 2021-06-03 22:03:27
 */
public interface FeipinxinxiDao extends BaseMapper<FeipinxinxiEntity> {
	
	List<FeipinxinxiVO> selectListVO(@Param("ew") Wrapper<FeipinxinxiEntity> wrapper);
	
	FeipinxinxiVO selectVO(@Param("ew") Wrapper<FeipinxinxiEntity> wrapper);
	
	List<FeipinxinxiView> selectListView(@Param("ew") Wrapper<FeipinxinxiEntity> wrapper);

	List<FeipinxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<FeipinxinxiEntity> wrapper);
	
	FeipinxinxiView selectView(@Param("ew") Wrapper<FeipinxinxiEntity> wrapper);
	
}
