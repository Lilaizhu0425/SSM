package com.lhz.spring.pojo;

import org.springframework.beans.factory.FactoryBean;

public class UserFactoryBean implements FactoryBean<Books> {
    public Books getObject() throws Exception {
        return new Books();
    }

    public Class<?> getObjectType() {
        return Books.class;
    }
}
