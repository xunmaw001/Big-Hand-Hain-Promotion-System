package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QiyezhixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QiyezhixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QiyezhixingView;


/**
 * 企业之星
 *
 * @author 
 * @email 
 * @date 2021-01-29 11:14:25
 */
public interface QiyezhixingService extends IService<QiyezhixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QiyezhixingVO> selectListVO(Wrapper<QiyezhixingEntity> wrapper);
   	
   	QiyezhixingVO selectVO(@Param("ew") Wrapper<QiyezhixingEntity> wrapper);
   	
   	List<QiyezhixingView> selectListView(Wrapper<QiyezhixingEntity> wrapper);
   	
   	QiyezhixingView selectView(@Param("ew") Wrapper<QiyezhixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QiyezhixingEntity> wrapper);
   	
}

