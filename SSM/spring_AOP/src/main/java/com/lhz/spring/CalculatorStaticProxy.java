package com.lhz.spring;

import com.lhz.spring.impl.CalculatorPureImpl;

public class CalculatorStaticProxy implements Calculator  {
    private CalculatorPureImpl target;
    public CalculatorStaticProxy(CalculatorPureImpl target) {
        this.target = target;
    }

    @Override
    public int add(int i, int j) {
        int add=0;
        try {
            System.out.println("");
             add = target.add(i, j);


        } catch (Exception e) {
            e.printStackTrace();
        }
        return add;
    }

    @Override
    public int sub(int i, int j) {
        return 0;
    }

    @Override
    public int mul(int i, int j) {
        return 0;
    }

    @Override
    public int div(int i, int j) {
        return 0;
    }
}
