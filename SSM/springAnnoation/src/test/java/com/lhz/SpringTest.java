package com.lhz;

import com.lhz.controller.BooksController;
import com.lhz.service.impl.BooksSerciece;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringTest {


    @Autowired
    @Qualifier("booksServiceImpl ")
    BooksSerciece booksSerciece;
    @Autowired
    BooksController booksController1;
    @Test
    public  void  test1(){
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext-ioc.xml");

       // BooksSerciece bean = classPathXmlApplicationContext.getBean(BooksSerciece.class);
        BooksController booksController = (BooksController) classPathXmlApplicationContext.getBean("booksController");

        booksController  .savreUser();

}
}
