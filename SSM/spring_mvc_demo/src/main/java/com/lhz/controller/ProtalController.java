package com.lhz.controller;

import com.lhz.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class ProtalController {


    @GetMapping("/")
    public String protal(){
        return "index";
    }
    @PostMapping("/parm/servletAPI")

    @ResponseBody
    public void getParm(@RequestHeader("Referer") String referer){
        //String userName = httpServletRequest.getParameter("userName");

        System.out.println(referer);
    }
}
