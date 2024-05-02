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


import com.dao.BangongyongpinDao;
import com.entity.BangongyongpinEntity;
import com.service.BangongyongpinService;
import com.entity.vo.BangongyongpinVO;
import com.entity.view.BangongyongpinView;

@Service("bangongyongpinService")
public class BangongyongpinServiceImpl extends ServiceImpl<BangongyongpinDao, BangongyongpinEntity> implements BangongyongpinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BangongyongpinEntity> page = this.selectPage(
                new Query<BangongyongpinEntity>(params).getPage(),
                new EntityWrapper<BangongyongpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BangongyongpinEntity> wrapper) {
		  Page<BangongyongpinView> page =new Query<BangongyongpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BangongyongpinVO> selectListVO(Wrapper<BangongyongpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BangongyongpinVO selectVO(Wrapper<BangongyongpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BangongyongpinView> selectListView(Wrapper<BangongyongpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BangongyongpinView selectView(Wrapper<BangongyongpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
