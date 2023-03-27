package com.lhz.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.PrintWriter;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = ArithmeticException.class)
    public ModelAndView exceptionHandler(HttpServletRequest req, ArithmeticException e, ServletResponse servletResponse) throws IOException {
        log.error("发生算数异常！原因是:{}", e);
        /*servletResponse.setContentType("text/html; charset=utf-8");
        PrintWriter writer = servletResponse.getWriter();
        writer.write("空指针异常");*/
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("error");
        modelAndView.addObject("ex",e.getMessage());
        return modelAndView;
    }

}
