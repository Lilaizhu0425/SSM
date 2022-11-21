package com.lhz;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.lhz.mapper.BoosMapper;
import com.lhz.mapper.SqlMoHUMapper;
import com.lhz.pojo.Books;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

@Slf4j
public class BooksTest {
   // private static Logger logger= (Logger) LoggerFactory.getLogger(BooksTest.class);
    @Test
    public  void  test1() throws IOException {

        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = sqlSessionFactoryBuilder.build(resourceAsStream);
        SqlSession sqlSession = build.openSession(true);

        BoosMapper mapper = sqlSession.getMapper(BoosMapper.class);
        //Books books = mapper.getBooksName("ceshi");
        Books books = new Books(null, "玄幻", "aaddda", "好aa看");
        SqlMoHUMapper mapper1 = sqlSession.getMapper(SqlMoHUMapper.class);

        //mapper.insertBooks(books);
        //int count = mapper.getCount();
        //Map<String, Object> allBooksToMap = mapper.getAllBooksToMap();
        Map<String, Object> spring = mapper1.getMoHuNameBooks("spring");
        mapper1.insertBooks(books);
        System.out.println(books.getId());


        log.info("当前数量{}",spring);

        //System.out.println(books);

    }
    @Test
    public  void test2() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = sqlSessionFactoryBuilder.build(resourceAsStream);
        SqlSession sqlSession = build.openSession(true);

        BoosMapper mapper = sqlSession.getMapper(BoosMapper.class);

        Map<String, Object> allBooksToMap = mapper.getAllBooksToMap();
        Page<Object> objects = PageHelper.startPage(2, 4);

        Map<String, Object> allBooksToMap1 = mapper.getAllBooksToMap();
        System.out.println(allBooksToMap1);
    }
}
