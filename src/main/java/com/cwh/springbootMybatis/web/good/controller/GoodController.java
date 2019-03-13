package com.cwh.springbootMybatis.web.good.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cwh.springbootMybatis.util.R;
import com.cwh.springbootMybatis.web.good.entity.Good;
import com.cwh.springbootMybatis.web.good.service.GoodService;


@Controller
@RequestMapping(value = "/Good/")
public class GoodController {

	 private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private GoodService GoodService;
	
	@RequestMapping(value = "/selectListGoods")
	public R selectListGoods(){
		//日志级别从低到高分为TRACE < DEBUG < INFO < WARN < ERROR < FATAL，如果设置为WARN，则低于WARN的信息都不会输出。
        logger.trace("日志输出 trace");
        logger.debug("日志输出 debug");
        logger.info("日志输出 info");
        logger.warn("日志输出 warn");
        logger.error("日志输出 error");
		
		List<Good> goods = GoodService.selectListGoods();
		if(goods == null){
			return R.error(-1, "faill");
		}else {
			return R.ok().put("data", goods);
		}
	}
	
	@RequestMapping(value = "/list")
	public String list(Model model){
		List<Good> goods = GoodService.selectListGoods();
		model.addAttribute("users", R.ok().put("data", goods));
		return "list";
	}
}
