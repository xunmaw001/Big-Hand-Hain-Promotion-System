package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DiscusshezuoxinxiEntity;
import com.entity.view.DiscusshezuoxinxiView;

import com.service.DiscusshezuoxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 合作信息评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2021-01-29 11:14:25
 */
@RestController
@RequestMapping("/discusshezuoxinxi")
public class DiscusshezuoxinxiController {
    @Autowired
    private DiscusshezuoxinxiService discusshezuoxinxiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscusshezuoxinxiEntity discusshezuoxinxi, HttpServletRequest request){

        EntityWrapper<DiscusshezuoxinxiEntity> ew = new EntityWrapper<DiscusshezuoxinxiEntity>();
		PageUtils page = discusshezuoxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusshezuoxinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscusshezuoxinxiEntity discusshezuoxinxi, HttpServletRequest request){
        EntityWrapper<DiscusshezuoxinxiEntity> ew = new EntityWrapper<DiscusshezuoxinxiEntity>();
		PageUtils page = discusshezuoxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusshezuoxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscusshezuoxinxiEntity discusshezuoxinxi){
       	EntityWrapper<DiscusshezuoxinxiEntity> ew = new EntityWrapper<DiscusshezuoxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discusshezuoxinxi, "discusshezuoxinxi")); 
        return R.ok().put("data", discusshezuoxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscusshezuoxinxiEntity discusshezuoxinxi){
        EntityWrapper< DiscusshezuoxinxiEntity> ew = new EntityWrapper< DiscusshezuoxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discusshezuoxinxi, "discusshezuoxinxi")); 
		DiscusshezuoxinxiView discusshezuoxinxiView =  discusshezuoxinxiService.selectView(ew);
		return R.ok("查询合作信息评论表成功").put("data", discusshezuoxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscusshezuoxinxiEntity discusshezuoxinxi = discusshezuoxinxiService.selectById(id);
        return R.ok().put("data", discusshezuoxinxi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscusshezuoxinxiEntity discusshezuoxinxi = discusshezuoxinxiService.selectById(id);
        return R.ok().put("data", discusshezuoxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscusshezuoxinxiEntity discusshezuoxinxi, HttpServletRequest request){
    	discusshezuoxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusshezuoxinxi);

        discusshezuoxinxiService.insert(discusshezuoxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscusshezuoxinxiEntity discusshezuoxinxi, HttpServletRequest request){
    	discusshezuoxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusshezuoxinxi);

        discusshezuoxinxiService.insert(discusshezuoxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DiscusshezuoxinxiEntity discusshezuoxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discusshezuoxinxi);
        discusshezuoxinxiService.updateById(discusshezuoxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discusshezuoxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DiscusshezuoxinxiEntity> wrapper = new EntityWrapper<DiscusshezuoxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = discusshezuoxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
