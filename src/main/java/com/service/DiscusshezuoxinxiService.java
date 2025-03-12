package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusshezuoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusshezuoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusshezuoxinxiView;


/**
 * 合作信息评论表
 *
 * @author 
 * @email 
 * @date 2021-01-29 11:14:25
 */
public interface DiscusshezuoxinxiService extends IService<DiscusshezuoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusshezuoxinxiVO> selectListVO(Wrapper<DiscusshezuoxinxiEntity> wrapper);
   	
   	DiscusshezuoxinxiVO selectVO(@Param("ew") Wrapper<DiscusshezuoxinxiEntity> wrapper);
   	
   	List<DiscusshezuoxinxiView> selectListView(Wrapper<DiscusshezuoxinxiEntity> wrapper);
   	
   	DiscusshezuoxinxiView selectView(@Param("ew") Wrapper<DiscusshezuoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusshezuoxinxiEntity> wrapper);
   	
}

