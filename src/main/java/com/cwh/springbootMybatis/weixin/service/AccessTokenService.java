package com.cwh.springbootMybatis.weixin.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cwh.springbootMybatis.weixin.entity.AccessToken;






@Service
public interface AccessTokenService{

	
	
	public int update(Map<String, Object> map);

	
	public List<AccessToken> listById(AccessToken accessToken);
}
