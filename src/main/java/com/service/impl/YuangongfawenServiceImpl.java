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


import com.dao.YuangongfawenDao;
import com.entity.YuangongfawenEntity;
import com.service.YuangongfawenService;
import com.entity.vo.YuangongfawenVO;
import com.entity.view.YuangongfawenView;

@Service("yuangongfawenService")
public class YuangongfawenServiceImpl extends ServiceImpl<YuangongfawenDao, YuangongfawenEntity> implements YuangongfawenService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuangongfawenEntity> page = this.selectPage(
                new Query<YuangongfawenEntity>(params).getPage(),
                new EntityWrapper<YuangongfawenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuangongfawenEntity> wrapper) {
		  Page<YuangongfawenView> page =new Query<YuangongfawenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuangongfawenVO> selectListVO(Wrapper<YuangongfawenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuangongfawenVO selectVO(Wrapper<YuangongfawenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuangongfawenView> selectListView(Wrapper<YuangongfawenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuangongfawenView selectView(Wrapper<YuangongfawenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
