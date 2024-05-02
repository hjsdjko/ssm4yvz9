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


import com.dao.DanganxinxiDao;
import com.entity.DanganxinxiEntity;
import com.service.DanganxinxiService;
import com.entity.vo.DanganxinxiVO;
import com.entity.view.DanganxinxiView;

@Service("danganxinxiService")
public class DanganxinxiServiceImpl extends ServiceImpl<DanganxinxiDao, DanganxinxiEntity> implements DanganxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DanganxinxiEntity> page = this.selectPage(
                new Query<DanganxinxiEntity>(params).getPage(),
                new EntityWrapper<DanganxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DanganxinxiEntity> wrapper) {
		  Page<DanganxinxiView> page =new Query<DanganxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DanganxinxiVO> selectListVO(Wrapper<DanganxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DanganxinxiVO selectVO(Wrapper<DanganxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DanganxinxiView> selectListView(Wrapper<DanganxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DanganxinxiView selectView(Wrapper<DanganxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
