package com.lhz.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.lhz.spring.pojo.MyBeanPost;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

@Slf4j
public class DataSourceTest {
    @Test
    public  void dataSource() throws SQLException {

        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        DruidDataSource datasource = (DruidDataSource) classPathXmlApplicationContext.getBean("dataSource");

        DruidPooledConnection connection = datasource.getConnection();
        System.out.println(connection);
        MyBeanPost myBeanPost = (MyBeanPost) classPathXmlApplicationContext.getBean("myBeanPost");


    }
}
