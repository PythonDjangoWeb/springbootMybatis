package com.cwh.springbootMybatis.web.login.service;

import com.cwh.springbootMybatis.util.GeneralReturn;

public interface LoginService {

	GeneralReturn  selectListUser();
	GeneralReturn  selectById(int id);
}
