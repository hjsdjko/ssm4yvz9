package com.dao;

import com.entity.GudingzichanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GudingzichanVO;
import com.entity.view.GudingzichanView;


/**
 * 固定资产
 * 
 * @author 
 * @email 
 * @date 2021-05-02 17:13:56
 */
public interface GudingzichanDao extends BaseMapper<GudingzichanEntity> {
	
	List<GudingzichanVO> selectListVO(@Param("ew") Wrapper<GudingzichanEntity> wrapper);
	
	GudingzichanVO selectVO(@Param("ew") Wrapper<GudingzichanEntity> wrapper);
	
	List<GudingzichanView> selectListView(@Param("ew") Wrapper<GudingzichanEntity> wrapper);

	List<GudingzichanView> selectListView(Pagination page,@Param("ew") Wrapper<GudingzichanEntity> wrapper);
	
	GudingzichanView selectView(@Param("ew") Wrapper<GudingzichanEntity> wrapper);
	
}
