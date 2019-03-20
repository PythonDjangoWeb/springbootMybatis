package com.cwh.springbootMybatis.web.user.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cwh.springbootMybatis.web.user.entity.User;
import com.cwh.springbootMybatis.web.user.mapper.UserMapper;
import com.cwh.springbootMybatis.web.user.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private  UserMapper UserMapper;
	
	@Override
	public User selectOpenId(String openid) {
		// TODO Auto-generated method stub
		return UserMapper.selectOpenId(openid);
	}

	@Override
	public Integer Update(User user) {
		// TODO Auto-generated method stub
		return UserMapper.Update(user);
	}

	@Override
	public Integer insert(User user) {
		// TODO Auto-generated method stub
		return UserMapper.insert(user);
	}

}
