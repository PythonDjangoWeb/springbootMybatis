package com.cwh.springbootMybatis.web.login.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cwh.springbootMybatis.web.login.entity.Login;

@Mapper
public interface LoginMapper {

	
	List<Login> selectListUser();
	Login selectById(int id);
}
