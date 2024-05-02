package com.dao;

import com.entity.BangongyongpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BangongyongpinVO;
import com.entity.view.BangongyongpinView;


/**
 * 办公用品
 * 
 * @author 
 * @email 
 * @date 2021-05-02 17:13:56
 */
public interface BangongyongpinDao extends BaseMapper<BangongyongpinEntity> {
	
	List<BangongyongpinVO> selectListVO(@Param("ew") Wrapper<BangongyongpinEntity> wrapper);
	
	BangongyongpinVO selectVO(@Param("ew") Wrapper<BangongyongpinEntity> wrapper);
	
	List<BangongyongpinView> selectListView(@Param("ew") Wrapper<BangongyongpinEntity> wrapper);

	List<BangongyongpinView> selectListView(Pagination page,@Param("ew") Wrapper<BangongyongpinEntity> wrapper);
	
	BangongyongpinView selectView(@Param("ew") Wrapper<BangongyongpinEntity> wrapper);
	
}
