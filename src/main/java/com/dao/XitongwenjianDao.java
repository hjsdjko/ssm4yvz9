package com.dao;

import com.entity.XitongwenjianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XitongwenjianVO;
import com.entity.view.XitongwenjianView;


/**
 * 系统文件
 * 
 * @author 
 * @email 
 * @date 2021-05-02 17:13:56
 */
public interface XitongwenjianDao extends BaseMapper<XitongwenjianEntity> {
	
	List<XitongwenjianVO> selectListVO(@Param("ew") Wrapper<XitongwenjianEntity> wrapper);
	
	XitongwenjianVO selectVO(@Param("ew") Wrapper<XitongwenjianEntity> wrapper);
	
	List<XitongwenjianView> selectListView(@Param("ew") Wrapper<XitongwenjianEntity> wrapper);

	List<XitongwenjianView> selectListView(Pagination page,@Param("ew") Wrapper<XitongwenjianEntity> wrapper);
	
	XitongwenjianView selectView(@Param("ew") Wrapper<XitongwenjianEntity> wrapper);
	
}
