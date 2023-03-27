package com.lhz.mybatis.mapper;

import com.lhz.mybatis.pojo.Books;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper

public interface BooksMapper {

    int inserBoos();

    @Select(value = "select *  from  tbl_book")
    List<Books> selectAll();


}
