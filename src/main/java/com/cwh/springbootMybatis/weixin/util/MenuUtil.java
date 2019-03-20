package com.cwh.springbootMybatis.weixin.util;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.cwh.springbootMybatis.weixin.controller.WxSettingController;
import com.cwh.springbootMybatis.weixin.entity.po.Token;

import net.sf.json.JSONObject;
public class MenuUtil extends StringUtil{

	private static final Logger log =Logger.getLogger(MenuUtil.class);
	public final static String menu_create_url = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token=ACCESS_TOKEN";
	public final static String menu_get_url = "https://api.weixin.qq.com/cgi-bin/menu/get?access_token=ACCESS_TOKEN";
	public final static String menu_delete_url = "https://api.weixin.qq.com/cgi-bin/menu/delete?access_token=ACCESS_TOKEN";
	
	// 调用接口获取凭证
	public static  Map<String,Object>  createMenu(Map<String,Object> map) {
		boolean result = false;
		WxSettingController wc= new WxSettingController(); //获取数据库appid等微信参数
		CommonUtil commonUtil = new CommonUtil();
		StringUtil st = new StringUtil();
		Token token = commonUtil.getToken(st.getSetting().getAppid(), st.getSetting().getAppsecret());
		String url = menu_create_url.replace("ACCESS_TOKEN", token.getAccessToken());
		String jsonMenu = JSONObject.fromObject(map).toString();
		System.out.println("生成需传给微信的菜单jsonStr="+jsonMenu);
		JSONObject jsonObject = CommonUtil.httpsRequest(url, "POST", jsonMenu);
		System.out.println("jsonObject="+jsonObject);
		String msg = "";
		if (null != jsonObject) {
			int errorCode = jsonObject.getInt("errcode");
			String errorMsg = jsonObject.getString("errmsg");
			if (0 == errorCode) {
				result = true;
				msg = "creat menu is OK!";
			} else {
				result = false;
				msg = "creat menu is errcode:{} errmsg:{}"+ errorCode+ errorMsg;
			}
		}
		Map<String,Object> rsMap = new HashMap<String, Object>();
		rsMap.put("rs", result);
		rsMap.put("message", msg);
		return rsMap;
	}

//	/**
//	 * ��ѯ�˵�
//	 * 
//	 * @param accessToken ƾ֤
//	 * @return
//	 */
	public static String getMenu(String accessToken) {
		String result = null;
		String requestUrl = menu_get_url.replace("ACCESS_TOKEN", accessToken);
		// ����GET�����ѯ�˵�
		JSONObject jsonObject = CommonUtil.httpsRequest(requestUrl, "GET", null);

		if (null != jsonObject) {
			result = jsonObject.toString();
		}
		return result;
	}
//
//	/**
//	 * ɾ���˵�
//	 * 
//	 * @param accessToken ƾ֤
//	 * @return true�ɹ� falseʧ��
//	 */
	public static boolean deleteMenu(String accessToken) {
		boolean result = false;
		String requestUrl = menu_delete_url.replace("ACCESS_TOKEN", accessToken);
		// ����GET����ɾ���˵�
		JSONObject jsonObject = CommonUtil.httpsRequest(requestUrl, "GET", null);

		if (null != jsonObject) {
			int errorCode = jsonObject.getInt("errcode");
			String errorMsg = jsonObject.getString("errmsg");
			if (0 == errorCode) {
				result = true;
			} else {
				result = false;
			//	log.error("ɾ���˵�ʧ�� errcode:{} errmsg:{}", errorCode, errorMsg);
				System.out.println("--------------------------�˵�ɾ��ʧ������----------------------");
			}
		}
		return result;
	}
}