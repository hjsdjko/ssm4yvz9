package com.dao;

import com.entity.GongsitushuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongsitushuVO;
import com.entity.view.GongsitushuView;


/**
 * 公司图书
 * 
 * @author 
 * @email 
 * @date 2021-05-02 17:13:56
 */
public interface GongsitushuDao extends BaseMapper<GongsitushuEntity> {
	
	List<GongsitushuVO> selectListVO(@Param("ew") Wrapper<GongsitushuEntity> wrapper);
	
	GongsitushuVO selectVO(@Param("ew") Wrapper<GongsitushuEntity> wrapper);
	
	List<GongsitushuView> selectListView(@Param("ew") Wrapper<GongsitushuEntity> wrapper);

	List<GongsitushuView> selectListView(Pagination page,@Param("ew") Wrapper<GongsitushuEntity> wrapper);
	
	GongsitushuView selectView(@Param("ew") Wrapper<GongsitushuEntity> wrapper);
	
}
