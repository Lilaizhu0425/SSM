package com.lhz.spring;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LogAspect {
    @Pointcut("execution(* com.lhz.spring.impl.CalculatorPureImpl.*(..))")//公共切入点

    public  void poinCut(){

    }
    @Before("poinCut()")//前置通知
    public void beforeMethod(JoinPoint joinPoint){
        Signature signature = joinPoint.getSignature();//获取连接点所对应方法的方法名
        Object[] args = joinPoint.getArgs();//获取当前方法的参数

        System.out.println("方法名："+signature+",参数："+ Arrays.toString(args));

        System.out.  println("前置增强");

    }
    @AfterReturning(value = "poinCut()",returning = "result")
    public void AfterReturning(Object result){

        System.out.println("目标对象值："+result);
    }
    @After("execution(* com.lhz.spring.impl.CalculatorPureImpl.*(..))")//前置通知
    public void afterMethod(){
        System.out.println("后置增强");

    }
    @Around("poinCut()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint){
        Object proceed=null;
        try {

            System.out.println("环绕通知---》前置通知");
            //表示目标方法的执行

            proceed= proceedingJoinPoint.proceed();
            System.out.println("环绕通知---》返回通知");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("环绕通知---》异常通知");
        }finally {
            System.out.println("环绕通知---》后置通知");

        }
        return   proceed;

    }
}
