package com.portfolio.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @RequestMapping("/home")
    @ResponseBody
    public String home(){
        return "여기는 home 이에요!";
    }
}
