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


import com.dao.XitongwenjianDao;
import com.entity.XitongwenjianEntity;
import com.service.XitongwenjianService;
import com.entity.vo.XitongwenjianVO;
import com.entity.view.XitongwenjianView;

@Service("xitongwenjianService")
public class XitongwenjianServiceImpl extends ServiceImpl<XitongwenjianDao, XitongwenjianEntity> implements XitongwenjianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XitongwenjianEntity> page = this.selectPage(
                new Query<XitongwenjianEntity>(params).getPage(),
                new EntityWrapper<XitongwenjianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XitongwenjianEntity> wrapper) {
		  Page<XitongwenjianView> page =new Query<XitongwenjianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XitongwenjianVO> selectListVO(Wrapper<XitongwenjianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XitongwenjianVO selectVO(Wrapper<XitongwenjianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XitongwenjianView> selectListView(Wrapper<XitongwenjianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XitongwenjianView selectView(Wrapper<XitongwenjianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
