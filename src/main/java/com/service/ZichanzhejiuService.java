package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZichanzhejiuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZichanzhejiuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZichanzhejiuView;


/**
 * 资产折旧
 *
 * @author 
 * @email 
 * @date 2021-05-02 17:13:56
 */
public interface ZichanzhejiuService extends IService<ZichanzhejiuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZichanzhejiuVO> selectListVO(Wrapper<ZichanzhejiuEntity> wrapper);
   	
   	ZichanzhejiuVO selectVO(@Param("ew") Wrapper<ZichanzhejiuEntity> wrapper);
   	
   	List<ZichanzhejiuView> selectListView(Wrapper<ZichanzhejiuEntity> wrapper);
   	
   	ZichanzhejiuView selectView(@Param("ew") Wrapper<ZichanzhejiuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZichanzhejiuEntity> wrapper);
   	
}

