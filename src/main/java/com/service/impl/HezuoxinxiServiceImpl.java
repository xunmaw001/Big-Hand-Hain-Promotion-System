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


import com.dao.HezuoxinxiDao;
import com.entity.HezuoxinxiEntity;
import com.service.HezuoxinxiService;
import com.entity.vo.HezuoxinxiVO;
import com.entity.view.HezuoxinxiView;

@Service("hezuoxinxiService")
public class HezuoxinxiServiceImpl extends ServiceImpl<HezuoxinxiDao, HezuoxinxiEntity> implements HezuoxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HezuoxinxiEntity> page = this.selectPage(
                new Query<HezuoxinxiEntity>(params).getPage(),
                new EntityWrapper<HezuoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HezuoxinxiEntity> wrapper) {
		  Page<HezuoxinxiView> page =new Query<HezuoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HezuoxinxiVO> selectListVO(Wrapper<HezuoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HezuoxinxiVO selectVO(Wrapper<HezuoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HezuoxinxiView> selectListView(Wrapper<HezuoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HezuoxinxiView selectView(Wrapper<HezuoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
