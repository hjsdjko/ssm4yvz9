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


import com.dao.GongzuohuibaoDao;
import com.entity.GongzuohuibaoEntity;
import com.service.GongzuohuibaoService;
import com.entity.vo.GongzuohuibaoVO;
import com.entity.view.GongzuohuibaoView;

@Service("gongzuohuibaoService")
public class GongzuohuibaoServiceImpl extends ServiceImpl<GongzuohuibaoDao, GongzuohuibaoEntity> implements GongzuohuibaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongzuohuibaoEntity> page = this.selectPage(
                new Query<GongzuohuibaoEntity>(params).getPage(),
                new EntityWrapper<GongzuohuibaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongzuohuibaoEntity> wrapper) {
		  Page<GongzuohuibaoView> page =new Query<GongzuohuibaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongzuohuibaoVO> selectListVO(Wrapper<GongzuohuibaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongzuohuibaoVO selectVO(Wrapper<GongzuohuibaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongzuohuibaoView> selectListView(Wrapper<GongzuohuibaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongzuohuibaoView selectView(Wrapper<GongzuohuibaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
