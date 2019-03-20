package com.cwh.springbootMybatis.weixin.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cwh.springbootMybatis.weixin.entity.WxNews;
import com.cwh.springbootMybatis.weixin.mapper.WxNewsMapper;
import com.cwh.springbootMybatis.weixin.service.WxNewsService;

@Service
public class WxNewsServiceImpl implements WxNewsService{

	@Autowired
	private WxNewsMapper WxNewsMapper;
	
	@Override
	public List<WxNews> AllNewsSelect() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WxNews NewsSelectCt_key(String ct_key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer InsertNews(WxNews returnNews) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer UpdateNews(WxNews returnNews) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteNews(String ct_key) {
		// TODO Auto-generated method stub
		return null;
	}

}
