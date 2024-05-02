package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BangongyongpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BangongyongpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BangongyongpinView;


/**
 * 办公用品
 *
 * @author 
 * @email 
 * @date 2021-05-02 17:13:56
 */
public interface BangongyongpinService extends IService<BangongyongpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BangongyongpinVO> selectListVO(Wrapper<BangongyongpinEntity> wrapper);
   	
   	BangongyongpinVO selectVO(@Param("ew") Wrapper<BangongyongpinEntity> wrapper);
   	
   	List<BangongyongpinView> selectListView(Wrapper<BangongyongpinEntity> wrapper);
   	
   	BangongyongpinView selectView(@Param("ew") Wrapper<BangongyongpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BangongyongpinEntity> wrapper);
   	
}

