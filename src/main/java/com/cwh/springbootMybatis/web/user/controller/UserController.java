package com.cwh.springbootMybatis.web.user.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cwh.springbootMybatis.util.SessionOpenId;
import com.cwh.springbootMybatis.web.user.entity.User;
import com.cwh.springbootMybatis.web.user.mapper.UserMapper;
import com.cwh.springbootMybatis.web.user.service.UserService;
import com.cwh.springbootMybatis.weixin.util.WxUtil;

/**
 * 微信公众号获取用户信
 * @author 王虎
 *
 */
@Controller
@RequestMapping(value = "/getUserInfo/")
public class UserController extends SessionOpenId{

	
	SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
	Map<String, Object> map = new HashMap();
	private User user = new User();
	
	@Autowired 
	private UserService UserService;
	
	@RequestMapping("/insert")
	public ModelAndView insert(String url, HttpServletRequest request,
			HttpServletResponse response, HttpSession session){
		String openid = "";
		String set_time = sf.format(new Date());
		int isUrl = 0;
		if (session.getAttribute("oppen_id") == null) {
			this.map = WxUtil.oppenIdInfo(request, session);
			openid = (String) this.map.get("openid");
			if (StringUtils.isNotEmpty(openid)) {
				this.user.setOpenid((openid));
				this.user.setUsername((String) this.map.get("realname"));
				this.user.setUserhead((String) this.map.get("head_img"));
				this.user.setRegtime(set_time);
				
				session.setAttribute("openid", openid);
				if (this.UserService.selectOpenId(openid) != null) {
					isUrl = this.UserService.Update(user);
				} else {
					isUrl = this.UserService.insert(this.user);
				}
			} else {
				isUrl = -1;
			}
		} else {
			isUrl = 1;
		}
		url = "redirect:" + url;
		String reUrl = (isUrl == 1) ? url : "page/error";
		return new ModelAndView(reUrl);
		
	}
	
}
