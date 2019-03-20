package com.cwh.springbootMybatis.weixin.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.cwh.springbootMybatis.weixin.entity.WxSetting;
import com.cwh.springbootMybatis.weixin.service.WxSettingService;
import com.cwh.springbootMybatis.weixin.mapper.WxSettingMapper;

@Service
@Transactional
public class WxSettingServiceImpl implements WxSettingService {
	
	@Autowired
	private WxSettingMapper WxSettingMapper ;
	
	
	public  WxSetting selectByPrimaryKey(Integer id){
		return WxSettingMapper.selectByPrimaryKey(id);
	}

	public    int updateByPrimaryKeySelective(WxSetting record){
		int rs = 0;
		try {
			rs = WxSettingMapper.updateByPrimaryKeySelective(record);
		} catch (Exception e) {
			rs = -1;
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
		}
		return rs;
	}
	
	
}
