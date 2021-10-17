package com.github.hahahehejun.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @Classname ApplicationContentextUtil
 * @Description spring上下文工具
 * @Date 2021/7/8 9:45 下午
 * @Author by wu
 */
public class ApplicationContentextUtil implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ApplicationContentextUtil.applicationContext = applicationContext;
    }

    public static Object getBean(Class clazz){
        return applicationContext.getBean(clazz);
    }

}
