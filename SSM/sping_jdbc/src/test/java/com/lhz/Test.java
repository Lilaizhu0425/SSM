package com.lhz;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPObject;
import com.sun.org.apache.xml.internal.security.exceptions.Base64DecodingException;
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
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

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
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from tbl_book");
        String s = JSON.toJSONString(maps);

        System.out.println(s);
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
        /**
         *
         */

    }
    @org.junit.Test
    public void  test9(){
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put(null,null);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }



    }
    @org.junit.Test
    public void test10() throws IOException, Base64DecodingException {
        InputStream resourceAsStream = Test.class.getClassLoader().getResourceAsStream("jdbc.properties");
        Properties properties = new Properties();
        properties.load(resourceAsStream);
        System.out.println(properties.getProperty("token"));
        BASE64Decoder decoder = new BASE64Decoder();
        BASE64Encoder encoder = new BASE64Encoder();

        String s="123:123";
        byte[] bytes1 = s.getBytes();

        String encode = encoder.encode(bytes1);

        System.out.println(encode);
        HashMap<String, Integer> stringIntegerHashMap = new HashMap<String, Integer>();

        String code=null;


        System.out.println(code.equals("0"));



    }
    @org.junit.Test
    public  void  test101(){

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("aa");
        arrayList.add("bb");
        arrayList.add("cc");
        arrayList.add("dd");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("'");
        String join = String.join("','", arrayList);

        stringBuffer.append(join);
        stringBuffer.append("'");
        String sqlUnitTeam="update dacp_datastash_unit set member_name=? , lastupd=now() , team_name=?" +
                " where unit_code in ("+ stringBuffer.toString()+")";
        System.out.println(sqlUnitTeam);

    }
    @org.junit.Test
    public void test02(){

            String hzName = "hahha.txt".substring("hahha.txt".lastIndexOf("."));
            System.out.println(hzName);


    }
    @org.junit.Test
    public void test03(){
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("name","lihaizhu");
        System.out.println(hashMap);
    }


}
