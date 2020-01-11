package com.mr.reception.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "test")
public class TestController {

    @RequestMapping(value = "toIndex")
    public String toIndex(){
        return "index";
    }

}
