package com.lhz;

import com.lhz.spring.Calculator;
import com.lhz.spring.ProxyFactory;
import com.lhz.spring.impl.CalculatorPureImpl;
import org.junit.Test;

public class ProxyTest {
    @Test
    public void  test(){
        CalculatorPureImpl calculatorPure = new CalculatorPureImpl();

        ProxyFactory proxyFactory=new ProxyFactory(calculatorPure);
        Calculator proxy = (Calculator) proxyFactory.getProxy();
        proxy.add(1,2);


    }
}
