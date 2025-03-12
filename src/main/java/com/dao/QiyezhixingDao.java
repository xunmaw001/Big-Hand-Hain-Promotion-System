package com.dao;

import com.entity.QiyezhixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QiyezhixingVO;
import com.entity.view.QiyezhixingView;


/**
 * 企业之星
 * 
 * @author 
 * @email 
 * @date 2021-01-29 11:14:25
 */
public interface QiyezhixingDao extends BaseMapper<QiyezhixingEntity> {
	
	List<QiyezhixingVO> selectListVO(@Param("ew") Wrapper<QiyezhixingEntity> wrapper);
	
	QiyezhixingVO selectVO(@Param("ew") Wrapper<QiyezhixingEntity> wrapper);
	
	List<QiyezhixingView> selectListView(@Param("ew") Wrapper<QiyezhixingEntity> wrapper);

	List<QiyezhixingView> selectListView(Pagination page,@Param("ew") Wrapper<QiyezhixingEntity> wrapper);
	
	QiyezhixingView selectView(@Param("ew") Wrapper<QiyezhixingEntity> wrapper);
	
}
