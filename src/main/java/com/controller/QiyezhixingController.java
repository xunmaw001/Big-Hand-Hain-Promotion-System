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

import com.entity.QiyezhixingEntity;
import com.entity.view.QiyezhixingView;

import com.service.QiyezhixingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 企业之星
 * 后端接口
 * @author 
 * @email 
 * @date 2021-01-29 11:14:25
 */
@RestController
@RequestMapping("/qiyezhixing")
public class QiyezhixingController {
    @Autowired
    private QiyezhixingService qiyezhixingService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,QiyezhixingEntity qiyezhixing, HttpServletRequest request){

        EntityWrapper<QiyezhixingEntity> ew = new EntityWrapper<QiyezhixingEntity>();
		PageUtils page = qiyezhixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, qiyezhixing), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,QiyezhixingEntity qiyezhixing, HttpServletRequest request){
        EntityWrapper<QiyezhixingEntity> ew = new EntityWrapper<QiyezhixingEntity>();
		PageUtils page = qiyezhixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, qiyezhixing), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( QiyezhixingEntity qiyezhixing){
       	EntityWrapper<QiyezhixingEntity> ew = new EntityWrapper<QiyezhixingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( qiyezhixing, "qiyezhixing")); 
        return R.ok().put("data", qiyezhixingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(QiyezhixingEntity qiyezhixing){
        EntityWrapper< QiyezhixingEntity> ew = new EntityWrapper< QiyezhixingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( qiyezhixing, "qiyezhixing")); 
		QiyezhixingView qiyezhixingView =  qiyezhixingService.selectView(ew);
		return R.ok("查询企业之星成功").put("data", qiyezhixingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        QiyezhixingEntity qiyezhixing = qiyezhixingService.selectById(id);
        return R.ok().put("data", qiyezhixing);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        QiyezhixingEntity qiyezhixing = qiyezhixingService.selectById(id);
        return R.ok().put("data", qiyezhixing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody QiyezhixingEntity qiyezhixing, HttpServletRequest request){
    	qiyezhixing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(qiyezhixing);

        qiyezhixingService.insert(qiyezhixing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody QiyezhixingEntity qiyezhixing, HttpServletRequest request){
    	qiyezhixing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(qiyezhixing);

        qiyezhixingService.insert(qiyezhixing);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody QiyezhixingEntity qiyezhixing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(qiyezhixing);
        qiyezhixingService.updateById(qiyezhixing);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        qiyezhixingService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<QiyezhixingEntity> wrapper = new EntityWrapper<QiyezhixingEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = qiyezhixingService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
