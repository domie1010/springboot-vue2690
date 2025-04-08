package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.FeipinleixingDao;
import com.entity.FeipinleixingEntity;
import com.service.FeipinleixingService;
import com.entity.vo.FeipinleixingVO;
import com.entity.view.FeipinleixingView;

@Service("feipinleixingService")
public class FeipinleixingServiceImpl extends ServiceImpl<FeipinleixingDao, FeipinleixingEntity> implements FeipinleixingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FeipinleixingEntity> page = this.selectPage(
                new Query<FeipinleixingEntity>(params).getPage(),
                new EntityWrapper<FeipinleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FeipinleixingEntity> wrapper) {
		  Page<FeipinleixingView> page =new Query<FeipinleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FeipinleixingVO> selectListVO(Wrapper<FeipinleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FeipinleixingVO selectVO(Wrapper<FeipinleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FeipinleixingView> selectListView(Wrapper<FeipinleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FeipinleixingView selectView(Wrapper<FeipinleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
