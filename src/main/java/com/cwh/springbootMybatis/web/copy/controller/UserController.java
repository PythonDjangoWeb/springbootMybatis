package com.cwh.springbootMybatis.web.copy.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cwh.springbootMybatis.web.copy.entity.User;
import com.cwh.springbootMybatis.web.copy.service.UserService;


  
@RestController  
@RequestMapping("/user")  
public class UserController {  
	 private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/getUserInfo")
    public List<User> getUserInfo() {
		//日志级别从低到高分为TRACE < DEBUG < INFO < WARN < ERROR < FATAL，如果设置为WARN，则低于WARN的信息都不会输出。
        logger.trace("日志输出 trace");
        logger.debug("日志输出 debug");
        logger.info("日志输出 info");
        logger.warn("日志输出 warn");
        logger.error("日志输出 error");
    	List<User> user = userService.getUserInfo();
    	
        System.out.println(user.toString());
        return user;
    }
	
	@RequestMapping("/addUserInfo")
    public String addUserInfo() {
		User user = new User();
		user.setId(3L);
		user.setName("cwh");
		userService.insert(user);
        return "success:"+user.toString();
    }
	
	
}  
