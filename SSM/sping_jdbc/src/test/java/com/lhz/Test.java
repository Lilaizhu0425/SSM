package com.lhz;

import lombok.extern.slf4j.Slf4j;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
@Slf4j
public class Test {
    @Autowired
    private  JdbcTemplate jdbcTemplate;
    @org.junit.Test
    public void test(){
       /* ApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate bean = ioc.getBean(JdbcTemplate.class);*/

        //System.out.println(jdbcTemplate);
        String sql="select * from tbl_book where id=?";
        Books books = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Books>(Books.class), 1);

        Map<String, Object> map = jdbcTemplate.queryForMap(sql, 1);
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql, 1);

        System.out.println(maps.toString());
        System.out.println(books);
    }
    @org.junit.Test
    public void  test1(){
        String sql="select * from tbl_book where id=250 ";
        List a;
        new ArrayList();
        /**
         *
         */

    }
    @org.junit.Test
    public void  test2() {
        String sql ="select watemake from test where descr=?";
        String watemake = null;

        try {
            watemake = jdbcTemplate.queryForObject(sql, String.class, 2555);
        } catch (Exception e) {
            watemake = null;;
        }


        System.out.println(watemake);
        System.out.println((!StringUtils.isEmpty(watemake))&&"1".equals(watemake));
        if((!org.springframework.util.StringUtils.isEmpty(watemake))&&"1".equals(watemake)){
            System.out.println("aaaa");
        }

    }


}
