package com.cwh.springbootMybatis.tool;

//import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;

import java.util.Map;

/**
 * spring上下文工具类
 * bean 的手动注入工具类
 */
//@Slf4j
public class ContextUtils {
    private static ApplicationContext applicationContext;


    public static void setApplicationContext(ApplicationContext applicationContext) {
        synchronized (ContextUtils.class) {
            ContextUtils.applicationContext = applicationContext;
            ContextUtils.class.notifyAll();
        }
    }

    public static ApplicationContext getApplicationContext() {
        synchronized (ContextUtils.class) {
            while (applicationContext == null) {
                try {
                   // log.debug("getApplicationContext, wait...");
                    ContextUtils.class.wait(60000);
                    if (applicationContext == null) {
                   //     log.warn("Have been waiting for ApplicationContext to be set for 1 minute", new Exception());
                    }
                } catch (InterruptedException ex) {
                  //  log.debug("getApplicationContext, wait interrupted");
                }
            }
            return applicationContext;
        }
    }

    /**
     * 根据名字获取实体
     *
     * @param name
     * @return
     */
    public static Object getBean(String name) {
        return getApplicationContext().getBean(name);
    }

    /**
     * 根据类型获取实体
     *
     * @param <T>
     * @param cls
     * @return
     */
    public static <T> Map<String, T> getBeansOfType(Class<T> cls) {
        return getApplicationContext().getBeansOfType(cls);
    }


}