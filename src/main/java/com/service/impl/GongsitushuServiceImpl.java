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


import com.dao.GongsitushuDao;
import com.entity.GongsitushuEntity;
import com.service.GongsitushuService;
import com.entity.vo.GongsitushuVO;
import com.entity.view.GongsitushuView;

@Service("gongsitushuService")
public class GongsitushuServiceImpl extends ServiceImpl<GongsitushuDao, GongsitushuEntity> implements GongsitushuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongsitushuEntity> page = this.selectPage(
                new Query<GongsitushuEntity>(params).getPage(),
                new EntityWrapper<GongsitushuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongsitushuEntity> wrapper) {
		  Page<GongsitushuView> page =new Query<GongsitushuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongsitushuVO> selectListVO(Wrapper<GongsitushuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongsitushuVO selectVO(Wrapper<GongsitushuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongsitushuView> selectListView(Wrapper<GongsitushuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongsitushuView selectView(Wrapper<GongsitushuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
