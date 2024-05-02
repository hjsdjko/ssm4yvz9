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


import com.dao.XiangmuguanliDao;
import com.entity.XiangmuguanliEntity;
import com.service.XiangmuguanliService;
import com.entity.vo.XiangmuguanliVO;
import com.entity.view.XiangmuguanliView;

@Service("xiangmuguanliService")
public class XiangmuguanliServiceImpl extends ServiceImpl<XiangmuguanliDao, XiangmuguanliEntity> implements XiangmuguanliService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiangmuguanliEntity> page = this.selectPage(
                new Query<XiangmuguanliEntity>(params).getPage(),
                new EntityWrapper<XiangmuguanliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiangmuguanliEntity> wrapper) {
		  Page<XiangmuguanliView> page =new Query<XiangmuguanliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiangmuguanliVO> selectListVO(Wrapper<XiangmuguanliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiangmuguanliVO selectVO(Wrapper<XiangmuguanliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiangmuguanliView> selectListView(Wrapper<XiangmuguanliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiangmuguanliView selectView(Wrapper<XiangmuguanliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
