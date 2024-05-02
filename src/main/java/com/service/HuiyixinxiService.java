package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuiyixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuiyixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuiyixinxiView;


/**
 * 会议信息
 *
 * @author 
 * @email 
 * @date 2021-05-02 17:13:56
 */
public interface HuiyixinxiService extends IService<HuiyixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuiyixinxiVO> selectListVO(Wrapper<HuiyixinxiEntity> wrapper);
   	
   	HuiyixinxiVO selectVO(@Param("ew") Wrapper<HuiyixinxiEntity> wrapper);
   	
   	List<HuiyixinxiView> selectListView(Wrapper<HuiyixinxiEntity> wrapper);
   	
   	HuiyixinxiView selectView(@Param("ew") Wrapper<HuiyixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuiyixinxiEntity> wrapper);
   	
}

