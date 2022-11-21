package com.lhz.mapper;

import com.lhz.pojo.Books;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface SqlMoHUMapper {
    @MapKey("id")
    Map<String,Object> getMoHuNameBooks(@Param("name") String name);

    void  insertBooks(Books books);



}
