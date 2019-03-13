package com.cwh.springbootMybatis.web.login.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cwh.springbootMybatis.util.GeneralReturn;
import com.cwh.springbootMybatis.util.JsonUtil;
import com.cwh.springbootMybatis.util.R;
import com.cwh.springbootMybatis.web.good.entity.Good;
import com.cwh.springbootMybatis.web.login.service.LoginService;

@Controller
@RequestMapping(value = "/Login/")
public class LoginController extends JsonUtil{
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	GeneralReturn Gr;
	
	@Autowired
	private  LoginService LoginService;
	
	@RequestMapping("/selectListUser")
	public void  selectListUser(){
		//日志级别从低到高分为TRACE < DEBUG < INFO < WARN < ERROR < FATAL，如果设置为WARN，则低于WARN的信息都不会输出。
        logger.trace("日志输出 trace");
        logger.debug("日志输出 debug");
        logger.info("日志输出 info");
        logger.warn("日志输出 warn");
        logger.error("日志输出 error");
		
		 Gr = LoginService.selectListUser();
		writeJson(Gr);
	}
	
	@RequestMapping(value = "/list")
	public String list(Model model){
		 Gr = LoginService.selectListUser();
		model.addAttribute("users", Gr);
		return "list";
	}
	@RequestMapping(value = "userOne")
	public String userOne(Model model){
		 model.addAttribute("user", null);
		 return "one";
	}
	@GetMapping("one/{id}")
	public String one(Model model,@PathVariable("id") int id){
		//日志级别从低到高分为TRACE < DEBUG < INFO < WARN < ERROR < FATAL，如果设置为WARN，则低于WARN的信息都不会输出。
        logger.trace("日志输出 trace");
        logger.debug("日志输出 debug");
        logger.info("日志输出 info");
        logger.warn("日志输出 warn");
        logger.error("日志输出 error");
		 Gr = LoginService.selectById(id);
		 logger.info("查询获取用户信息user{}",Gr);
		 
		 model.addAttribute("user", Gr);
		 return "user";
	}
}
