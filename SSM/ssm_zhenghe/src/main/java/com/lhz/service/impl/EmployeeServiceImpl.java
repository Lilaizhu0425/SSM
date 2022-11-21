package com.lhz.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lhz.mapper.EmployeeMapper;
import com.lhz.pojo.Emlopee;
import com.lhz.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;
    public List<Emlopee> getAllEmployee() {
        List<Emlopee> lie =employeeMapper.getAllEmployee();
        return lie;
    }

    public PageInfo<Emlopee> getAllEmployeePage(Integer page) {
        //开启分页
        PageHelper.startPage(page,4);
        List<Emlopee> allEmployee = this.getAllEmployee();
        PageInfo<Emlopee> pahe=new PageInfo<Emlopee>(allEmployee,5);

        return pahe;
    }
}
