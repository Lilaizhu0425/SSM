package com.lhz.controller;

import com.github.pagehelper.PageInfo;
import com.lhz.pojo.Emlopee;
import com.lhz.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class EmpController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employee")
    public  String getAllEmployee(Model model){

        List<Emlopee> list= employeeService.getAllEmployee();
        model.addAttribute("list",list);
        return "employee_list";

    }
    @GetMapping("/employee/page/{page}")
    public  String getAllEmployeePage(@PathVariable("page") Integer page,Model model){

        PageInfo<Emlopee> pageInfo=employeeService.getAllEmployeePage(page);
        model.addAttribute("page",pageInfo);

        return "employee_list";
    }
}
