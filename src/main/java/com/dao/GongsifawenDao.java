package com.dao;

import com.entity.GongsifawenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongsifawenVO;
import com.entity.view.GongsifawenView;


/**
 * 公司发文
 * 
 * @author 
 * @email 
 * @date 2021-05-02 17:13:56
 */
public interface GongsifawenDao extends BaseMapper<GongsifawenEntity> {
	
	List<GongsifawenVO> selectListVO(@Param("ew") Wrapper<GongsifawenEntity> wrapper);
	
	GongsifawenVO selectVO(@Param("ew") Wrapper<GongsifawenEntity> wrapper);
	
	List<GongsifawenView> selectListView(@Param("ew") Wrapper<GongsifawenEntity> wrapper);

	List<GongsifawenView> selectListView(Pagination page,@Param("ew") Wrapper<GongsifawenEntity> wrapper);
	
	GongsifawenView selectView(@Param("ew") Wrapper<GongsifawenEntity> wrapper);
	
}
