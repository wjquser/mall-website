package com.mr.reception.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "test")
public class TestController {

    @RequestMapping(value = "toIndex")
    public String toIndex(){
        return "index";
    }

    @RequestMapping(value = "toGeren")
    public String toGeren(){
        return "User_Address";
    }

    @RequestMapping(value = "toCenter")
    public String toCenter(){
        return "User_Center";
    }

    @RequestMapping(value = "toOrdersList")
    public String toOrdersList(){
        return "user_OrdersList";
    }

    @RequestMapping(value = "tomyp")
    public String tomyp(){
        return "my-p";
    }

    @RequestMapping(value = "tomys")
    public String tomys(){
        return "my-s";
    }
    @RequestMapping(value = "test1")
    public String test1(){
        return "addlist";
    }

    @GetMapping(value = "toHTML")
    public ModelAndView toHTML(Long id){
        ModelAndView andView = new ModelAndView();
        andView.addObject("id",id);
        andView.setViewName("update");
       return andView;
    }

}
