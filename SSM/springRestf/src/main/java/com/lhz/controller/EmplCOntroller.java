package com.lhz.controller;

import com.lhz.dao.EmployeeDao;
import com.lhz.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;

@Controller
public class EmplCOntroller {
    @Autowired
    EmployeeDao employeeDao;
    @GetMapping("/employee")
    public ModelAndView empl(ModelAndView modelAndView){

        Collection<Employee> all = employeeDao.getAll();
        modelAndView.addObject("employeeList",all);
        modelAndView.setViewName("employee_list");
        return  modelAndView;

    }
    @PostMapping("/employee")
    public String emplPost(Employee  employee){

       employeeDao.save(employee);
       return "redirect:http://localhost:8080/springRestf_war_exploded/employee";

    }


}
