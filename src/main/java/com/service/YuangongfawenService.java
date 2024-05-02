package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuangongfawenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuangongfawenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuangongfawenView;


/**
 * 员工发文
 *
 * @author 
 * @email 
 * @date 2021-05-02 17:13:56
 */
public interface YuangongfawenService extends IService<YuangongfawenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuangongfawenVO> selectListVO(Wrapper<YuangongfawenEntity> wrapper);
   	
   	YuangongfawenVO selectVO(@Param("ew") Wrapper<YuangongfawenEntity> wrapper);
   	
   	List<YuangongfawenView> selectListView(Wrapper<YuangongfawenEntity> wrapper);
   	
   	YuangongfawenView selectView(@Param("ew") Wrapper<YuangongfawenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuangongfawenEntity> wrapper);
   	
}

