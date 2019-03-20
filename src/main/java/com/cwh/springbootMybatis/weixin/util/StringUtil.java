package com.cwh.springbootMybatis.weixin.util;



//import org.springframework.context.support.AbstractApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cwh.springbootMybatis.tool.ContextUtils;
import com.cwh.springbootMybatis.weixin.entity.WxSetting;
import com.cwh.springbootMybatis.weixin.service.serviceImpl.WxSettingServiceImpl;

public class StringUtil {
	
	public WxSetting getSetting(){
		//AbstractApplicationContext ctx   = new ClassPathXmlApplicationContext(new String []{"classpath:applicationContext.xml"});
		WxSettingServiceImpl wxSettingService = (WxSettingServiceImpl) ContextUtils.getBean("wxSettingServiceImpl");
				//(WxSettingServiceImpl)ctx.getBean("wxSettingServiceImpl") ;
		return wxSettingService.selectByPrimaryKey(1);
	}
	
	static String menu_create_url = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token=ACCESS_TOKEN";
	static String token_url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=APPID&secret=APPSECRET&code=CODE&grant_type=authorization_code"; 
	static String token_url2 = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET";
	static String template_id_1 = "C6YRjqsvDLYFuVQbVHfAWKWPbXD8Ca_lSwiXG8cQQNY"; 
	static String template_id_2 = "tjqPjlrB1vbXatR7_HhEefzjG1UNbacVTotD85J_ZR8	"; 
}
