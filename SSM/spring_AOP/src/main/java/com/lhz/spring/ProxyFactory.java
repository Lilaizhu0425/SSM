package com.lhz.spring;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ProxyFactory {

    private  Object target;
    public ProxyFactory(Object target){
        this.target=target;

    }
    public Object getProxy(){
        ClassLoader classLoader = target.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("方法："+method.getName()+"参数"+ Arrays.toString(args));
                Object invoke = method.invoke(target,args);
                System.out.println();
                return invoke;
            }
        };

        Object o = Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);

        return o;

    }
}
