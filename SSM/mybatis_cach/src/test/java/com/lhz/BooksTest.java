package com.lhz;

import com.lhz.mapper.BooksMapper;
import com.lhz.pojo.Books;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

@Slf4j
public class BooksTest {
    @Test
    public void test1() throws IOException {
        //InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        InputStream aa=new FileInputStream(new File("D:\\SSM\\SSM\\mybatis_cach\\src\\main\\resources\\mybatis-conf.xml"));
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = sqlSessionFactoryBuilder.build(aa);
        SqlSession sqlSession = build.openSession(true);

        BooksMapper mapper = sqlSession.getMapper(BooksMapper.class);
        //Books books = mapper.getBooksName("ceshi");
        Books books = new Books(null, "玄幻", "aaddda", "好aa看");
        Map<String, Object> map = mapper.selectAll();
        System.out.println(map);
        Map<String, Object> map2 = mapper.selectAll();
        System.out.println(map2);


    }
}
