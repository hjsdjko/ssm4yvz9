package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YongpinshenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YongpinshenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YongpinshenqingView;


/**
 * 用品申请
 *
 * @author 
 * @email 
 * @date 2021-05-02 17:13:56
 */
public interface YongpinshenqingService extends IService<YongpinshenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YongpinshenqingVO> selectListVO(Wrapper<YongpinshenqingEntity> wrapper);
   	
   	YongpinshenqingVO selectVO(@Param("ew") Wrapper<YongpinshenqingEntity> wrapper);
   	
   	List<YongpinshenqingView> selectListView(Wrapper<YongpinshenqingEntity> wrapper);
   	
   	YongpinshenqingView selectView(@Param("ew") Wrapper<YongpinshenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YongpinshenqingEntity> wrapper);
   	
}

