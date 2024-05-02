package com.dao;

import com.entity.ZichanzhejiuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZichanzhejiuVO;
import com.entity.view.ZichanzhejiuView;


/**
 * 资产折旧
 * 
 * @author 
 * @email 
 * @date 2021-05-02 17:13:56
 */
public interface ZichanzhejiuDao extends BaseMapper<ZichanzhejiuEntity> {
	
	List<ZichanzhejiuVO> selectListVO(@Param("ew") Wrapper<ZichanzhejiuEntity> wrapper);
	
	ZichanzhejiuVO selectVO(@Param("ew") Wrapper<ZichanzhejiuEntity> wrapper);
	
	List<ZichanzhejiuView> selectListView(@Param("ew") Wrapper<ZichanzhejiuEntity> wrapper);

	List<ZichanzhejiuView> selectListView(Pagination page,@Param("ew") Wrapper<ZichanzhejiuEntity> wrapper);
	
	ZichanzhejiuView selectView(@Param("ew") Wrapper<ZichanzhejiuEntity> wrapper);
	
}
