package com.lhz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

@Controller
public class TestScopeController {
    @GetMapping("/test/mav")
    public ModelAndView modelAndView(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("testRequest","hellow");
        modelAndView.setViewName("success");
        return modelAndView;

    }
    @GetMapping("/test/session")
    public String session(HttpSession httpSession){
       httpSession.setAttribute("aa","hellosession");
        return "success";

    }
    @GetMapping("/test/yu")
    public String yu(HttpSession httpSession){
        ServletContext servletContext = httpSession.getServletContext();

        servletContext.setAttribute("hha","helloyu");
        return "success";

    }
}
