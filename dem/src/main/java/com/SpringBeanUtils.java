package com;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author 夏凯
 * @Description
 * @since 2021/4/7 9:30
 */
@Component
public class SpringBeanUtils implements ApplicationContextAware {

    private static ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }

    public static <T> T getBean(Class<T> requiredType) {
        return (T)context.getBean(requiredType);
    }

    @SuppressWarnings("unchecked")
    public static <T> T getBean(String name) {
        return (T)context.getBean(name);
    }
}
