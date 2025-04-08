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


import com.dao.FeipinxinxiDao;
import com.entity.FeipinxinxiEntity;
import com.service.FeipinxinxiService;
import com.entity.vo.FeipinxinxiVO;
import com.entity.view.FeipinxinxiView;

@Service("feipinxinxiService")
public class FeipinxinxiServiceImpl extends ServiceImpl<FeipinxinxiDao, FeipinxinxiEntity> implements FeipinxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FeipinxinxiEntity> page = this.selectPage(
                new Query<FeipinxinxiEntity>(params).getPage(),
                new EntityWrapper<FeipinxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FeipinxinxiEntity> wrapper) {
		  Page<FeipinxinxiView> page =new Query<FeipinxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FeipinxinxiVO> selectListVO(Wrapper<FeipinxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FeipinxinxiVO selectVO(Wrapper<FeipinxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FeipinxinxiView> selectListView(Wrapper<FeipinxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FeipinxinxiView selectView(Wrapper<FeipinxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
