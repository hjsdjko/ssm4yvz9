package com.dao;

import com.entity.XiangmuguanliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiangmuguanliVO;
import com.entity.view.XiangmuguanliView;


/**
 * 项目管理
 * 
 * @author 
 * @email 
 * @date 2021-05-02 17:13:55
 */
public interface XiangmuguanliDao extends BaseMapper<XiangmuguanliEntity> {
	
	List<XiangmuguanliVO> selectListVO(@Param("ew") Wrapper<XiangmuguanliEntity> wrapper);
	
	XiangmuguanliVO selectVO(@Param("ew") Wrapper<XiangmuguanliEntity> wrapper);
	
	List<XiangmuguanliView> selectListView(@Param("ew") Wrapper<XiangmuguanliEntity> wrapper);

	List<XiangmuguanliView> selectListView(Pagination page,@Param("ew") Wrapper<XiangmuguanliEntity> wrapper);
	
	XiangmuguanliView selectView(@Param("ew") Wrapper<XiangmuguanliEntity> wrapper);
	
}
