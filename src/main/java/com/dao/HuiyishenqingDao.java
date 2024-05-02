package com.dao;

import com.entity.HuiyishenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuiyishenqingVO;
import com.entity.view.HuiyishenqingView;


/**
 * 会议申请
 * 
 * @author 
 * @email 
 * @date 2021-05-02 17:13:56
 */
public interface HuiyishenqingDao extends BaseMapper<HuiyishenqingEntity> {
	
	List<HuiyishenqingVO> selectListVO(@Param("ew") Wrapper<HuiyishenqingEntity> wrapper);
	
	HuiyishenqingVO selectVO(@Param("ew") Wrapper<HuiyishenqingEntity> wrapper);
	
	List<HuiyishenqingView> selectListView(@Param("ew") Wrapper<HuiyishenqingEntity> wrapper);

	List<HuiyishenqingView> selectListView(Pagination page,@Param("ew") Wrapper<HuiyishenqingEntity> wrapper);
	
	HuiyishenqingView selectView(@Param("ew") Wrapper<HuiyishenqingEntity> wrapper);
	
}
