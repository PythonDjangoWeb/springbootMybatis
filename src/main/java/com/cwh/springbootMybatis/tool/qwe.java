package com.cwh.springbootMybatis.tool;

import com.cwh.springbootMybatis.util.GeneralReturn;
import com.cwh.springbootMybatis.web.login.service.LoginService;

/**
 * 测试spring bean的手动注入测试类
 * @author 王虎
 *
 */
public class qwe {

	private LoginService LoginService = (com.cwh.springbootMybatis.web.login.service.LoginService) ContextUtils.getBean("LoginServiceImpl"); 
	
	
	public GeneralReturn abc(){
		GeneralReturn gr = LoginService.selectById(1);
		System.out.println(gr.getData());
		return gr;
	}
}
