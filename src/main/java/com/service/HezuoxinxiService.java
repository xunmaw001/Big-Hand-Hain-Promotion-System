package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HezuoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HezuoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HezuoxinxiView;


/**
 * 合作信息
 *
 * @author 
 * @email 
 * @date 2021-01-29 11:14:25
 */
public interface HezuoxinxiService extends IService<HezuoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HezuoxinxiVO> selectListVO(Wrapper<HezuoxinxiEntity> wrapper);
   	
   	HezuoxinxiVO selectVO(@Param("ew") Wrapper<HezuoxinxiEntity> wrapper);
   	
   	List<HezuoxinxiView> selectListView(Wrapper<HezuoxinxiEntity> wrapper);
   	
   	HezuoxinxiView selectView(@Param("ew") Wrapper<HezuoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HezuoxinxiEntity> wrapper);
   	
}

