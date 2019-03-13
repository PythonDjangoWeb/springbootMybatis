package com.cwh.springbootMybatis.web.good.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cwh.springbootMybatis.web.good.entity.Good;
@Mapper
public interface GoodMapper {
	List<Good> selectListGoods();
}
