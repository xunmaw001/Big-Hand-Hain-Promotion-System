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


import com.dao.DiscusshezuoxinxiDao;
import com.entity.DiscusshezuoxinxiEntity;
import com.service.DiscusshezuoxinxiService;
import com.entity.vo.DiscusshezuoxinxiVO;
import com.entity.view.DiscusshezuoxinxiView;

@Service("discusshezuoxinxiService")
public class DiscusshezuoxinxiServiceImpl extends ServiceImpl<DiscusshezuoxinxiDao, DiscusshezuoxinxiEntity> implements DiscusshezuoxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusshezuoxinxiEntity> page = this.selectPage(
                new Query<DiscusshezuoxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscusshezuoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusshezuoxinxiEntity> wrapper) {
		  Page<DiscusshezuoxinxiView> page =new Query<DiscusshezuoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusshezuoxinxiVO> selectListVO(Wrapper<DiscusshezuoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusshezuoxinxiVO selectVO(Wrapper<DiscusshezuoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusshezuoxinxiView> selectListView(Wrapper<DiscusshezuoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusshezuoxinxiView selectView(Wrapper<DiscusshezuoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
