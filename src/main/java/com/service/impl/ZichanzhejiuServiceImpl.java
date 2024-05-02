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


import com.dao.ZichanzhejiuDao;
import com.entity.ZichanzhejiuEntity;
import com.service.ZichanzhejiuService;
import com.entity.vo.ZichanzhejiuVO;
import com.entity.view.ZichanzhejiuView;

@Service("zichanzhejiuService")
public class ZichanzhejiuServiceImpl extends ServiceImpl<ZichanzhejiuDao, ZichanzhejiuEntity> implements ZichanzhejiuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZichanzhejiuEntity> page = this.selectPage(
                new Query<ZichanzhejiuEntity>(params).getPage(),
                new EntityWrapper<ZichanzhejiuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZichanzhejiuEntity> wrapper) {
		  Page<ZichanzhejiuView> page =new Query<ZichanzhejiuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZichanzhejiuVO> selectListVO(Wrapper<ZichanzhejiuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZichanzhejiuVO selectVO(Wrapper<ZichanzhejiuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZichanzhejiuView> selectListView(Wrapper<ZichanzhejiuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZichanzhejiuView selectView(Wrapper<ZichanzhejiuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
