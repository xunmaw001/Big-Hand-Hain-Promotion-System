package com.dao;

import com.entity.DiscusshezuoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusshezuoxinxiVO;
import com.entity.view.DiscusshezuoxinxiView;


/**
 * 合作信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-01-29 11:14:25
 */
public interface DiscusshezuoxinxiDao extends BaseMapper<DiscusshezuoxinxiEntity> {
	
	List<DiscusshezuoxinxiVO> selectListVO(@Param("ew") Wrapper<DiscusshezuoxinxiEntity> wrapper);
	
	DiscusshezuoxinxiVO selectVO(@Param("ew") Wrapper<DiscusshezuoxinxiEntity> wrapper);
	
	List<DiscusshezuoxinxiView> selectListView(@Param("ew") Wrapper<DiscusshezuoxinxiEntity> wrapper);

	List<DiscusshezuoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusshezuoxinxiEntity> wrapper);
	
	DiscusshezuoxinxiView selectView(@Param("ew") Wrapper<DiscusshezuoxinxiEntity> wrapper);
	
}
