package com.dao;

import com.entity.HezuoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HezuoxinxiVO;
import com.entity.view.HezuoxinxiView;


/**
 * 合作信息
 * 
 * @author 
 * @email 
 * @date 2021-01-29 11:14:25
 */
public interface HezuoxinxiDao extends BaseMapper<HezuoxinxiEntity> {
	
	List<HezuoxinxiVO> selectListVO(@Param("ew") Wrapper<HezuoxinxiEntity> wrapper);
	
	HezuoxinxiVO selectVO(@Param("ew") Wrapper<HezuoxinxiEntity> wrapper);
	
	List<HezuoxinxiView> selectListView(@Param("ew") Wrapper<HezuoxinxiEntity> wrapper);

	List<HezuoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<HezuoxinxiEntity> wrapper);
	
	HezuoxinxiView selectView(@Param("ew") Wrapper<HezuoxinxiEntity> wrapper);
	
}
