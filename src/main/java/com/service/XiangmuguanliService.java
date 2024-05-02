package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiangmuguanliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiangmuguanliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiangmuguanliView;


/**
 * 项目管理
 *
 * @author 
 * @email 
 * @date 2021-05-02 17:13:55
 */
public interface XiangmuguanliService extends IService<XiangmuguanliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiangmuguanliVO> selectListVO(Wrapper<XiangmuguanliEntity> wrapper);
   	
   	XiangmuguanliVO selectVO(@Param("ew") Wrapper<XiangmuguanliEntity> wrapper);
   	
   	List<XiangmuguanliView> selectListView(Wrapper<XiangmuguanliEntity> wrapper);
   	
   	XiangmuguanliView selectView(@Param("ew") Wrapper<XiangmuguanliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiangmuguanliEntity> wrapper);
   	
}

