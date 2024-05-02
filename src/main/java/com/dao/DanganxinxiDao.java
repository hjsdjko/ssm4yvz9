package com.dao;

import com.entity.DanganxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DanganxinxiVO;
import com.entity.view.DanganxinxiView;


/**
 * 档案信息
 * 
 * @author 
 * @email 
 * @date 2021-05-02 17:13:56
 */
public interface DanganxinxiDao extends BaseMapper<DanganxinxiEntity> {
	
	List<DanganxinxiVO> selectListVO(@Param("ew") Wrapper<DanganxinxiEntity> wrapper);
	
	DanganxinxiVO selectVO(@Param("ew") Wrapper<DanganxinxiEntity> wrapper);
	
	List<DanganxinxiView> selectListView(@Param("ew") Wrapper<DanganxinxiEntity> wrapper);

	List<DanganxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DanganxinxiEntity> wrapper);
	
	DanganxinxiView selectView(@Param("ew") Wrapper<DanganxinxiEntity> wrapper);
	
}
