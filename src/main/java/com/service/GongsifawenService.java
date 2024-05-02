package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongsifawenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongsifawenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongsifawenView;


/**
 * 公司发文
 *
 * @author 
 * @email 
 * @date 2021-05-02 17:13:56
 */
public interface GongsifawenService extends IService<GongsifawenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongsifawenVO> selectListVO(Wrapper<GongsifawenEntity> wrapper);
   	
   	GongsifawenVO selectVO(@Param("ew") Wrapper<GongsifawenEntity> wrapper);
   	
   	List<GongsifawenView> selectListView(Wrapper<GongsifawenEntity> wrapper);
   	
   	GongsifawenView selectView(@Param("ew") Wrapper<GongsifawenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongsifawenEntity> wrapper);
   	
}

