package com.cwh.springbootMybatis.interceptor;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 拦截器配置
 * @Author:王虎
 * @Description:
 * @Date:Create in 17:35 2018/3/12
 * @Modified By:
 */
@Configuration
public class WebAppConfig extends WebMvcConfigurerAdapter {

    /**
     * 注册 拦截器
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 设置拦截的路径、不拦截的路径、优先级等等
        registry.addInterceptor(new SessionInterceptor()).addPathPatterns("/Login/**").excludePathPatterns("/Login/one/**","/Login/test");
    }
}
