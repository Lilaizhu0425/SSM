package com.lhz;


import com.lhz.controller.BookController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringAnnoation {
    @Autowired
    BookController bookController;
    @Test
    public void test() throws InterruptedException {
        bookController.buyBooks(2,1);
        System.out.println(bookController);


    }

}
