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


import com.dao.HuiyishenqingDao;
import com.entity.HuiyishenqingEntity;
import com.service.HuiyishenqingService;
import com.entity.vo.HuiyishenqingVO;
import com.entity.view.HuiyishenqingView;

@Service("huiyishenqingService")
public class HuiyishenqingServiceImpl extends ServiceImpl<HuiyishenqingDao, HuiyishenqingEntity> implements HuiyishenqingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuiyishenqingEntity> page = this.selectPage(
                new Query<HuiyishenqingEntity>(params).getPage(),
                new EntityWrapper<HuiyishenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuiyishenqingEntity> wrapper) {
		  Page<HuiyishenqingView> page =new Query<HuiyishenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuiyishenqingVO> selectListVO(Wrapper<HuiyishenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuiyishenqingVO selectVO(Wrapper<HuiyishenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuiyishenqingView> selectListView(Wrapper<HuiyishenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuiyishenqingView selectView(Wrapper<HuiyishenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
