package com.cwh.springbootMybatis.web.good.service;

import java.util.List;

import com.cwh.springbootMybatis.util.GeneralReturn;
import com.cwh.springbootMybatis.web.good.entity.Good;

public interface GoodService {

	
	List<Good> selectListGoods();
}
