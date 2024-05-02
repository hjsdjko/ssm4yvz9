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


import com.dao.XitongrizhiDao;
import com.entity.XitongrizhiEntity;
import com.service.XitongrizhiService;
import com.entity.vo.XitongrizhiVO;
import com.entity.view.XitongrizhiView;

@Service("xitongrizhiService")
public class XitongrizhiServiceImpl extends ServiceImpl<XitongrizhiDao, XitongrizhiEntity> implements XitongrizhiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XitongrizhiEntity> page = this.selectPage(
                new Query<XitongrizhiEntity>(params).getPage(),
                new EntityWrapper<XitongrizhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XitongrizhiEntity> wrapper) {
		  Page<XitongrizhiView> page =new Query<XitongrizhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XitongrizhiVO> selectListVO(Wrapper<XitongrizhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XitongrizhiVO selectVO(Wrapper<XitongrizhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XitongrizhiView> selectListView(Wrapper<XitongrizhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XitongrizhiView selectView(Wrapper<XitongrizhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
