package com.dao;

import com.entity.YongpinshenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YongpinshenqingVO;
import com.entity.view.YongpinshenqingView;


/**
 * 用品申请
 * 
 * @author 
 * @email 
 * @date 2021-05-02 17:13:56
 */
public interface YongpinshenqingDao extends BaseMapper<YongpinshenqingEntity> {
	
	List<YongpinshenqingVO> selectListVO(@Param("ew") Wrapper<YongpinshenqingEntity> wrapper);
	
	YongpinshenqingVO selectVO(@Param("ew") Wrapper<YongpinshenqingEntity> wrapper);
	
	List<YongpinshenqingView> selectListView(@Param("ew") Wrapper<YongpinshenqingEntity> wrapper);

	List<YongpinshenqingView> selectListView(Pagination page,@Param("ew") Wrapper<YongpinshenqingEntity> wrapper);
	
	YongpinshenqingView selectView(@Param("ew") Wrapper<YongpinshenqingEntity> wrapper);
	
}
