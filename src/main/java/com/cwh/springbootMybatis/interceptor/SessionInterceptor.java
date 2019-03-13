package com.cwh.springbootMybatis.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.PrintWriter;

/**
 * @Author:Lvxingqing
 * @Description:
 * @Date:Create in 17:02 2018/3/12
 * @Modified By:
 */
public class SessionInterceptor implements HandlerInterceptor {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("开始请求地址拦截");
        HttpSession session = request.getSession(false);
        String url = (request.getRequestURL() + "?" + request.getQueryString())
				.toString();
        logger.info("请求url:"+url);
        if (session != null && session.getAttribute("user") != null) {
            return true;
        } else {
            PrintWriter printWriter = response.getWriter();
            printWriter.write("{code:0,message:\"not login!\"}");
            return false;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("返回视图或String之前的处理");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("返回视图或String之前的处理");
    }
}
