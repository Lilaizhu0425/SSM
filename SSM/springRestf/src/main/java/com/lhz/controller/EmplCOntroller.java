package com.lhz.controller;

import com.lhz.dao.EmployeeDao;
import com.lhz.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class EmplCOntroller {
    @Autowired
    EmployeeDao employeeDao;
    @GetMapping(value = "employee",headers = "Referer",produces = "text/html; charset=UTF-8")
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView empl(ModelAndView modelAndView){
        System.out.println(1/0);

        Collection<Employee> all = employeeDao.getAll();
        modelAndView.addObject("employeeList",all);
        modelAndView.setViewName("employee_list");
        return  modelAndView;

    }
    @PostMapping(value = "/employee",produces = "text/html; charset=UTF-8")
    public String emplPost(Employee  employee){

       employeeDao.save(employee);
       return "redirect:http://localhost:8080/springRestf_war_exploded/employee";

    }
    @PostMapping("/request/{id}")

    public  @ResponseBody  String test(@PathVariable("id") String id){
        System.out.println("aaaaaa"+id);

        return "success";
    }


}
