package com.lhz.mapper;

import com.lhz.pojo.Books;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface BoosMapper {


    Books getBooksName( @Param("name") String name);
    void  insertBooks(Books books);
    int getCount();
    @MapKey("id")
    Map<String,Object> getAllBooksToMap();

}
