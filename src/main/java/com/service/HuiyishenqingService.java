package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuiyishenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuiyishenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuiyishenqingView;


/**
 * 会议申请
 *
 * @author 
 * @email 
 * @date 2021-05-02 17:13:56
 */
public interface HuiyishenqingService extends IService<HuiyishenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuiyishenqingVO> selectListVO(Wrapper<HuiyishenqingEntity> wrapper);
   	
   	HuiyishenqingVO selectVO(@Param("ew") Wrapper<HuiyishenqingEntity> wrapper);
   	
   	List<HuiyishenqingView> selectListView(Wrapper<HuiyishenqingEntity> wrapper);
   	
   	HuiyishenqingView selectView(@Param("ew") Wrapper<HuiyishenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuiyishenqingEntity> wrapper);
   	
}

