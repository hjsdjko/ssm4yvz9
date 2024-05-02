package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XitongrizhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XitongrizhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XitongrizhiView;


/**
 * 系统日志
 *
 * @author 
 * @email 
 * @date 2021-05-02 17:13:56
 */
public interface XitongrizhiService extends IService<XitongrizhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XitongrizhiVO> selectListVO(Wrapper<XitongrizhiEntity> wrapper);
   	
   	XitongrizhiVO selectVO(@Param("ew") Wrapper<XitongrizhiEntity> wrapper);
   	
   	List<XitongrizhiView> selectListView(Wrapper<XitongrizhiEntity> wrapper);
   	
   	XitongrizhiView selectView(@Param("ew") Wrapper<XitongrizhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XitongrizhiEntity> wrapper);
   	
}

