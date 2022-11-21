package com.lhz.test;

import com.lhz.spring.pojo.A;
import com.lhz.spring.pojo.AS;
import com.lhz.spring.pojo.Books;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;

public class SpringTest {
   @Autowired
    AS as;
    @Test
    public void  test1(){

       ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        A a = (A) classPathXmlApplicationContext.getBean("a");
        String asr = a.ASR();
        System.out.println(asr);
        Books books = (Books) classPathXmlApplicationContext.getBean("books");
        System.out.println(books.toString());

    }
}
