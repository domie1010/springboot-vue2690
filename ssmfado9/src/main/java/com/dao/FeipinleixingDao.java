package com.dao;

import com.entity.FeipinleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FeipinleixingVO;
import com.entity.view.FeipinleixingView;


/**
 * 废品类型
 * 
 * @author 
 * @email 
 * @date 2021-06-03 22:03:27
 */
public interface FeipinleixingDao extends BaseMapper<FeipinleixingEntity> {
	
	List<FeipinleixingVO> selectListVO(@Param("ew") Wrapper<FeipinleixingEntity> wrapper);
	
	FeipinleixingVO selectVO(@Param("ew") Wrapper<FeipinleixingEntity> wrapper);
	
	List<FeipinleixingView> selectListView(@Param("ew") Wrapper<FeipinleixingEntity> wrapper);

	List<FeipinleixingView> selectListView(Pagination page,@Param("ew") Wrapper<FeipinleixingEntity> wrapper);
	
	FeipinleixingView selectView(@Param("ew") Wrapper<FeipinleixingEntity> wrapper);
	
}
