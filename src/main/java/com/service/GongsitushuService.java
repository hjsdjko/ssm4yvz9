package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongsitushuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongsitushuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongsitushuView;


/**
 * 公司图书
 *
 * @author 
 * @email 
 * @date 2021-05-02 17:13:56
 */
public interface GongsitushuService extends IService<GongsitushuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongsitushuVO> selectListVO(Wrapper<GongsitushuEntity> wrapper);
   	
   	GongsitushuVO selectVO(@Param("ew") Wrapper<GongsitushuEntity> wrapper);
   	
   	List<GongsitushuView> selectListView(Wrapper<GongsitushuEntity> wrapper);
   	
   	GongsitushuView selectView(@Param("ew") Wrapper<GongsitushuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongsitushuEntity> wrapper);
   	
}

