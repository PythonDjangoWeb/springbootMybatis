package com.cwh.springbootMybatis.web.good.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cwh.springbootMybatis.util.GeneralReturn;
import com.cwh.springbootMybatis.web.good.entity.Good;
import com.cwh.springbootMybatis.web.good.mapper.GoodMapper;
import com.cwh.springbootMybatis.web.good.service.GoodService;

@Service
public class GoodServiceImpl implements GoodService{

	GeneralReturn GR;
	
	@Autowired
	private GoodMapper GoodMapper;
	
	@Override
	public List<Good> selectListGoods() {
		// TODO Auto-generated method stub
		List<Good> Goods = GoodMapper.selectListGoods();
		if(Goods.size() >0){
			return Goods;
		}else {
			return null;
		}
	}

}
