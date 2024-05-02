package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DanganxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DanganxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DanganxinxiView;


/**
 * 档案信息
 *
 * @author 
 * @email 
 * @date 2021-05-02 17:13:56
 */
public interface DanganxinxiService extends IService<DanganxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DanganxinxiVO> selectListVO(Wrapper<DanganxinxiEntity> wrapper);
   	
   	DanganxinxiVO selectVO(@Param("ew") Wrapper<DanganxinxiEntity> wrapper);
   	
   	List<DanganxinxiView> selectListView(Wrapper<DanganxinxiEntity> wrapper);
   	
   	DanganxinxiView selectView(@Param("ew") Wrapper<DanganxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DanganxinxiEntity> wrapper);
   	
}

