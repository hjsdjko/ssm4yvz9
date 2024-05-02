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


import com.dao.GongsifawenDao;
import com.entity.GongsifawenEntity;
import com.service.GongsifawenService;
import com.entity.vo.GongsifawenVO;
import com.entity.view.GongsifawenView;

@Service("gongsifawenService")
public class GongsifawenServiceImpl extends ServiceImpl<GongsifawenDao, GongsifawenEntity> implements GongsifawenService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongsifawenEntity> page = this.selectPage(
                new Query<GongsifawenEntity>(params).getPage(),
                new EntityWrapper<GongsifawenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongsifawenEntity> wrapper) {
		  Page<GongsifawenView> page =new Query<GongsifawenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongsifawenVO> selectListVO(Wrapper<GongsifawenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongsifawenVO selectVO(Wrapper<GongsifawenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongsifawenView> selectListView(Wrapper<GongsifawenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongsifawenView selectView(Wrapper<GongsifawenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
