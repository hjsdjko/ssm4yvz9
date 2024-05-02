package com.dao;

import com.entity.GongzuohuibaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongzuohuibaoVO;
import com.entity.view.GongzuohuibaoView;


/**
 * 工作汇报
 * 
 * @author 
 * @email 
 * @date 2021-05-02 17:13:56
 */
public interface GongzuohuibaoDao extends BaseMapper<GongzuohuibaoEntity> {
	
	List<GongzuohuibaoVO> selectListVO(@Param("ew") Wrapper<GongzuohuibaoEntity> wrapper);
	
	GongzuohuibaoVO selectVO(@Param("ew") Wrapper<GongzuohuibaoEntity> wrapper);
	
	List<GongzuohuibaoView> selectListView(@Param("ew") Wrapper<GongzuohuibaoEntity> wrapper);

	List<GongzuohuibaoView> selectListView(Pagination page,@Param("ew") Wrapper<GongzuohuibaoEntity> wrapper);
	
	GongzuohuibaoView selectView(@Param("ew") Wrapper<GongzuohuibaoEntity> wrapper);
	
}
