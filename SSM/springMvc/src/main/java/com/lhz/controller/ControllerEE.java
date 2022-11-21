package com.lhz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerEE {
    @GetMapping("/aa")
    @ResponseBody
    public String heh(){
        return "heh";
    }
}
