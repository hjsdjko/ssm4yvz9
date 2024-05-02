package com.dao;

import com.entity.YuangongfawenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuangongfawenVO;
import com.entity.view.YuangongfawenView;


/**
 * 员工发文
 * 
 * @author 
 * @email 
 * @date 2021-05-02 17:13:56
 */
public interface YuangongfawenDao extends BaseMapper<YuangongfawenEntity> {
	
	List<YuangongfawenVO> selectListVO(@Param("ew") Wrapper<YuangongfawenEntity> wrapper);
	
	YuangongfawenVO selectVO(@Param("ew") Wrapper<YuangongfawenEntity> wrapper);
	
	List<YuangongfawenView> selectListView(@Param("ew") Wrapper<YuangongfawenEntity> wrapper);

	List<YuangongfawenView> selectListView(Pagination page,@Param("ew") Wrapper<YuangongfawenEntity> wrapper);
	
	YuangongfawenView selectView(@Param("ew") Wrapper<YuangongfawenEntity> wrapper);
	
}
