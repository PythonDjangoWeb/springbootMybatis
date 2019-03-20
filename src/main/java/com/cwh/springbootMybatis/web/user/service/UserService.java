package com.cwh.springbootMybatis.web.user.service;

import com.cwh.springbootMybatis.web.user.entity.User;

public interface UserService {

	
	User selectOpenId(String openid);
	
	Integer Update(User user);
	
	Integer insert(User user);
}
