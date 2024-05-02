package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XitongwenjianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XitongwenjianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XitongwenjianView;


/**
 * 系统文件
 *
 * @author 
 * @email 
 * @date 2021-05-02 17:13:56
 */
public interface XitongwenjianService extends IService<XitongwenjianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XitongwenjianVO> selectListVO(Wrapper<XitongwenjianEntity> wrapper);
   	
   	XitongwenjianVO selectVO(@Param("ew") Wrapper<XitongwenjianEntity> wrapper);
   	
   	List<XitongwenjianView> selectListView(Wrapper<XitongwenjianEntity> wrapper);
   	
   	XitongwenjianView selectView(@Param("ew") Wrapper<XitongwenjianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XitongwenjianEntity> wrapper);
   	
}

