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


import com.dao.HuiyixinxiDao;
import com.entity.HuiyixinxiEntity;
import com.service.HuiyixinxiService;
import com.entity.vo.HuiyixinxiVO;
import com.entity.view.HuiyixinxiView;

@Service("huiyixinxiService")
public class HuiyixinxiServiceImpl extends ServiceImpl<HuiyixinxiDao, HuiyixinxiEntity> implements HuiyixinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuiyixinxiEntity> page = this.selectPage(
                new Query<HuiyixinxiEntity>(params).getPage(),
                new EntityWrapper<HuiyixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuiyixinxiEntity> wrapper) {
		  Page<HuiyixinxiView> page =new Query<HuiyixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuiyixinxiVO> selectListVO(Wrapper<HuiyixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuiyixinxiVO selectVO(Wrapper<HuiyixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuiyixinxiView> selectListView(Wrapper<HuiyixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuiyixinxiView selectView(Wrapper<HuiyixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
