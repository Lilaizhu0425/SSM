package com.lhz.mybatis;

import com.lhz.mybatis.mapper.BooksMapper;
import com.lhz.mybatis.pojo.Books;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
@Slf4j
public class MybatisTest {
    @Test
    public  void  test() throws IOException {

        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-conf.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = sqlSessionFactoryBuilder.build(resourceAsStream);
        SqlSession sqlSession = build.openSession(true);
        BooksMapper mapper = sqlSession.getMapper(BooksMapper.class);

        //int i = mapper.inserBoos();
        Books books = mapper.selectAll();
        System.out.println(books.toString());

        // sqlSession.commit();
        sqlSession.close();


    }
}
