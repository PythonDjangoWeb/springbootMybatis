package com.cwh.springbootMybatis.weixin.util;

import java.io.IOException;

import com.cwh.springbootMybatis.weixin.entity.po.Token;

import net.sf.json.JSONObject;




public class JsapiTicketUtil {
	
	private static final String appId = "wx44e9ad003c3f9940";
	private static final String appSecret = "4492ebf1221d8d3c4da87b1e1e5954c2";
	public final static String weixin_jssdk_ticket_url = "https://api.weixin.qq.com/cgi-bin/ticket/getticket?access_token=ACCESS_TOKEN&type=jsapi";
	
	 /**
     * 
     * 获取jsapi_ticket
     * 
     * @return
     * @throws IOException
     * @throws ParseException
     */
/*    public static String getJsapiTicket() throws ParseException, IOException {
    	CommonUtil CommonUtil = new CommonUtil();
		Token token = CommonUtil.getToken(appId, appSecret);
        String url = weixin_jssdk_ticket_url.replace("ACCESS_TOKEN", token.getAccessToken());
        JSONObject jsonObject = doGetStr(url);
        String jsapi_ticket = null;
        if (jsonObject != null) {
            jsapi_ticket = jsonObject.getString("ticket");
        }
        return jsapi_ticket;
    }*/
	/**
	 * HttpClient get
	 * 
	 * @param url
	 * @return
	 * @throws ParseException
	 * @throws IOException
	 */
	/*public static JSONObject doGetStr(String url) throws ParseException, IOException {
		DefaultHttpClient client = new DefaultHttpClient();
		HttpGet httpGet = new HttpGet(url);
		JSONObject jsonObject = null;
		HttpResponse httpResponse = client.execute(httpGet);
		HttpEntity entity = httpResponse.getEntity();
		if (entity != null) {
			String result = EntityUtils.toString(entity, "UTF-8");
			jsonObject = JSONObject.fromObject(result);
		}
		return jsonObject;
	}*/
}
