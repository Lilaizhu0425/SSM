package com.lhz.mapper;

import com.lhz.pojo.Emlopee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface EmployeeMapper {


    @Select("select * from t_emp")
    List<Emlopee> getAllEmployee();
}
