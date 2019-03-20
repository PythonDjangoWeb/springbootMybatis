package com.cwh.springbootMybatis.weixin.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSONArray;
import com.cwh.springbootMybatis.weixin.controller.WxSettingController;
import com.cwh.springbootMybatis.weixin.entity.po.Token;


public class StatisticsUtil extends StringUtil {
	private static final Logger log =Logger.getLogger(StatisticsUtil.class);
	
	public final static String statistics_create_url ="https://api.weixin.qq.com/datacube/getusercumulate?access_token=ACCESS_TOKEN";
	
	public  static Map<String , String[]> statisticsUser(Map<String,Object> map){
		Map<String , String[]> m=new HashMap<String, String[]>();
		String [] dates=new String [7];
		String [] nums=new String[7];
		boolean result = false;
		WxSettingController wc= new WxSettingController(); //获取数据库appid等微信参数
		CommonUtil commonUtil = new CommonUtil();
		StringUtil st = new StringUtil();
		Token token = commonUtil.getToken(st.getSetting().getAppid(), st.getSetting().getAppsecret());
		String url = statistics_create_url.replace("ACCESS_TOKEN", token.getAccessToken());
		String jsonUser = JSONObject.fromObject(map).toString();
		System.out.println("获取微信用户分析数据jsonStr="+jsonUser);
		JSONObject jsonObject = CommonUtil.httpsRequest(url, "POST", jsonUser);
		Iterator it=jsonObject.keys();
		while (it.hasNext()) {
			String key=(String)it.next();
			System.out.println(key);
			String value=jsonObject.getString(key);
			System.out.println(value);
			JSONArray json=JSONArray.parseArray(value);
			if(json.size()>0){
				for (int i = 0; i < json.size(); i++) {
					com.alibaba.fastjson.JSONObject j=json.getJSONObject(i);
					System.out.println(j.get("ref_date"));
					System.out.println(j.get("cumulate_user"));
					String a=(String) j.get("ref_date");
					String b=String.valueOf(j.get("cumulate_user"));
					System.out.println("a="+a);
					System.out.println(i);
					System.out.println("b="+b);
					dates[i]=a;
					nums[i]=b;
				}
			}
		}
		m.put("dates", dates);
		m.put("nums", nums);
		return m;
	}
	
	public static void main(String[] args) {
		String str="{\"TI\":[{\"value\":\"a\",\"count\":10},{\"value\":\"a2\",\"count\":15},{\"value\":\"a1\",\"count\":15}]}";
		
		try {
			JSONObject obj=JSONObject.fromObject(str);
			Iterator it=obj.keys();
			while (it.hasNext()) {
				String key=(String)it.next();
				System.out.println(key);
				String value=obj.getString(key);
				System.out.println(value);
				JSONArray json = JSONArray.parseArray(value);
				if(json.size()>0){
					for (int i = 0; i < json.size(); i++) {
						com.alibaba.fastjson.JSONObject j=json.getJSONObject(i);
						System.out.println(j.get("value")+"=");
					}
				}
						
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
