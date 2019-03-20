package com.cwh.springbootMybatis.weixin.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cwh.springbootMybatis.util.GeneralReturn;
import com.cwh.springbootMybatis.weixin.entity.WxSetting;
import com.cwh.springbootMybatis.weixin.entity.po.Token;
import com.cwh.springbootMybatis.weixin.service.WxSettingService;
import com.cwh.springbootMybatis.weixin.util.CheckUtil;
import com.cwh.springbootMybatis.weixin.util.CommonUtil;
import com.cwh.springbootMybatis.weixin.util.StringUtil;
import com.google.gson.Gson;



@Controller
@RequestMapping
public class WxSettingController extends StringUtil{
	public static String jsapi_ticket = null;
    public static long ticket_time = 0;
    
    GeneralReturn GR;
	@Autowired
	private WxSettingService wxSettingService;
	
	Map<String,Object> map = new HashMap<String, Object>();
	Gson gson = new Gson();
	@ResponseBody
	@RequestMapping(value="/main/wxSettingUpdate.html")
	public String update(WxSetting wxSetting){
		wxSetting.setId(1);
		int rs  =	wxSettingService.updateByPrimaryKeySelective(wxSetting);
		if(rs!=1){
			map.put("message","update button error!");
		}
		map.put("rs", rs);
		return gson.toJson(map);
	}
	
	@RequestMapping(value="/main/wxSettingList.html")
	public ModelAndView getList(ModelAndView ml){
		ml.addObject("list",wxSettingService.selectByPrimaryKey(1));
		ml.setViewName("main/setting/info");
		return  ml ;
	}
	
//	public WxSetting getSetting(){
//		return wxSettingService.selectByPrimaryKey(1);
//	}
	
    /**
     * @param weixin JS-SDK
     * @return
     */
    @RequestMapping(value = "/GetSDK")
    @ResponseBody
    public void getSDK(String url, HttpServletRequest request){
    	Map<String, Object> sdk_map = new HashMap<String, Object>();
    	sdk_map=WxJsapiSignature(url);
    	GR = GeneralReturn.build(1, "success", sdk_map);
		//writeJson(GR);
    }
    
    //获取Signature 
    public Map<String,Object> WxJsapiSignature(String url){
    	 if (jsapi_ticket == null || new Date().getTime()/1000-ticket_time>7100) {
    		 startChangejsapiTicket();
    	 }
    	 String noncestr = String.valueOf(new Date().getTime());
    	 String timestamp = String.valueOf(new Date().getTime()/1000);
    	 String signature="jsapi_ticket="+jsapi_ticket+"&noncestr="+noncestr+"&timestamp="+timestamp+"&url="+url;
    	 signature=CheckUtil.getSha1(signature);
    	 Map<String,Object> map = new HashMap<String, Object>(); 
    	 StringUtil st = new StringUtil();
    	 map.put("noncestr", noncestr);
    	 map.put("appId", st.getSetting().getAppid());
    	 map.put("timestamp", timestamp);
    	 map.put("signature", signature);
    	 return map;
    }
    /**
     * 获取JSAPI_TICKET
     */
    private void startChangejsapiTicket() {
       
            
            	CommonUtil commonUtil = new CommonUtil();
            	StringUtil st = new StringUtil();
        		Token token = commonUtil.getToken(st.getSetting().getAppid(), st.getSetting().getAppsecret());
        		String url="https://api.weixin.qq.com/cgi-bin/ticket/getticket?access_token=ACCESS_TOKEN&type=jsapi";
        		url=url.replace("ACCESS_TOKEN", token.getAccessToken());
        		JSONObject resJson=CommonUtil.httpsRequest(url, "GET", null);
        		if(resJson!=null){
        			jsapi_ticket=resJson.getString("ticket");
        			ticket_time =new Date().getTime()/1000;
        		}

    }
	
}
