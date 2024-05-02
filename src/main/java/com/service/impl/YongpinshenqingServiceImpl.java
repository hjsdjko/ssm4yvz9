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


import com.dao.YongpinshenqingDao;
import com.entity.YongpinshenqingEntity;
import com.service.YongpinshenqingService;
import com.entity.vo.YongpinshenqingVO;
import com.entity.view.YongpinshenqingView;

@Service("yongpinshenqingService")
public class YongpinshenqingServiceImpl extends ServiceImpl<YongpinshenqingDao, YongpinshenqingEntity> implements YongpinshenqingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YongpinshenqingEntity> page = this.selectPage(
                new Query<YongpinshenqingEntity>(params).getPage(),
                new EntityWrapper<YongpinshenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YongpinshenqingEntity> wrapper) {
		  Page<YongpinshenqingView> page =new Query<YongpinshenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YongpinshenqingVO> selectListVO(Wrapper<YongpinshenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YongpinshenqingVO selectVO(Wrapper<YongpinshenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YongpinshenqingView> selectListView(Wrapper<YongpinshenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YongpinshenqingView selectView(Wrapper<YongpinshenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
