package com.lhz.service;

import com.github.pagehelper.PageInfo;
import com.lhz.pojo.Emlopee;

import java.util.List;

public interface EmployeeService {
    List<Emlopee> getAllEmployee();

    PageInfo<Emlopee> getAllEmployeePage(Integer page);
}
