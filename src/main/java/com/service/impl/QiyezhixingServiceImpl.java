package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.QiyezhixingDao;
import com.entity.QiyezhixingEntity;
import com.service.QiyezhixingService;
import com.entity.vo.QiyezhixingVO;
import com.entity.view.QiyezhixingView;

@Service("qiyezhixingService")
public class QiyezhixingServiceImpl extends ServiceImpl<QiyezhixingDao, QiyezhixingEntity> implements QiyezhixingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QiyezhixingEntity> page = this.selectPage(
                new Query<QiyezhixingEntity>(params).getPage(),
                new EntityWrapper<QiyezhixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QiyezhixingEntity> wrapper) {
		  Page<QiyezhixingView> page =new Query<QiyezhixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QiyezhixingVO> selectListVO(Wrapper<QiyezhixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QiyezhixingVO selectVO(Wrapper<QiyezhixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QiyezhixingView> selectListView(Wrapper<QiyezhixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QiyezhixingView selectView(Wrapper<QiyezhixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
