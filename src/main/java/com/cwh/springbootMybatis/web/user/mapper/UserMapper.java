package com.cwh.springbootMybatis.web.user.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.cwh.springbootMybatis.web.user.entity.User;

@Mapper
public interface UserMapper {

		User selectOpenId(String openid);
	
		Integer Update(User user);
		
		Integer insert(User user);
	
}
