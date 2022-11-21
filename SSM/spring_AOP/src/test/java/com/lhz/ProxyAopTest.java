package com.lhz;

import com.lhz.spring.Calculator;
import com.lhz.spring.LogAspect;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProxyAopTest {
    @Autowired
    private LogAspect logAspect;
    @Test
    public void test(){
        ApplicationContext ioc=new ClassPathXmlApplicationContext("spring-conf.xml");
        Calculator bean = ioc.getBean(Calculator.class);//通过aop增强的类在ioc容器都找不到这个类，得通过代理类，代理类和目标类都是实现了相同的接口，通过向上转型获得代理类

       bean.div(1,0);


    }
}
