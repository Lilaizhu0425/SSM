package com.lhz.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPost implements BeanPostProcessor {



    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("当前后置处理器------》postProcessBeforeInitialization");
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("当前后置处理器------》postProcessAfterInitialization");

        return bean;
    }
}
