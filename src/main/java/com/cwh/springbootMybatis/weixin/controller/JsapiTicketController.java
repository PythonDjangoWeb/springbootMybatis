package com.cwh.springbootMybatis.weixin.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cwh.springbootMybatis.util.GeneralReturn;
import com.cwh.springbootMybatis.weixin.util.StringUtil;





@Controller
@RequestMapping("JsapiTicket")
public class JsapiTicketController extends StringUtil{

	GeneralReturn GR;
	
	@ResponseBody
	@RequestMapping(value = "/share.html")
    public void share(String url) throws Exception {
      /*  Map<String, String> ret = new HashMap<String, String>();
        String jsapi_ticket = JsapiTicketUtil.getJsapiTicket();
        String timestamp = Long.toString(System.currentTimeMillis() / 1000);
        String nonceStr = UUID.randomUUID().toString();
        String signature = SignUtil.getSignature(
            jsapi_ticket, nonceStr, timestamp,
            url);
        ret.put("url", url);
        ret.put("jsapi_ticket", jsapi_ticket);
        ret.put("nonceStr", nonceStr);
        ret.put("timestamp", timestamp);
        ret.put("signature", signature);
        ret.put("appid", "wx44e9ad003c3f9940");
        GR = GeneralReturn.build(1, "success", ret);
        writeJson(GR);*/
    }
}
