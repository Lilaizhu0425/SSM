package com.lhz.mapper;

import org.apache.ibatis.annotations.MapKey;

import java.util.List;
import java.util.Map;

public interface BooksMapper {
    @MapKey("id")
    Map<String,Object>  selectAll();
}
