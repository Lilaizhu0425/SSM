package com.lhz;

import com.lhz.controller.BooksController;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {




    BooksController booksController;
    @Test
    public  void  test1(){
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext-ioc.xml");

    BooksController bean = classPathXmlApplicationContext.getBean(BooksController.class);
       bean.savreUser();

}
}
