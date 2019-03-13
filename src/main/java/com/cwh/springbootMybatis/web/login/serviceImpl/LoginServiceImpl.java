package com.cwh.springbootMybatis.web.login.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cwh.springbootMybatis.util.GeneralReturn;
import com.cwh.springbootMybatis.web.login.entity.Login;
import com.cwh.springbootMybatis.web.login.mapper.LoginMapper;
import com.cwh.springbootMybatis.web.login.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService{

	GeneralReturn GR;
	
	@Autowired
	private LoginMapper LoginMappers;
	
	@Override
	public GeneralReturn selectListUser() {
		// TODO Auto-generated method stub
		List<Login> login = LoginMappers.selectListUser();
		if(login.size()>0){
			GR =	GeneralReturn.build(1, "success", login);
		}else {
			GR =    GeneralReturn.build(-1, "faill", null);
		}
		return GR;
	}

	@Override
	public GeneralReturn selectById(int id) {
		// TODO Auto-generated method stub
		Login login = LoginMappers.selectById(id);
		
		return GeneralReturn.build(login !=null?  1:-1 , login !=null?  "success":"faill", login);
	}

}
