package com.mr.home.controller;

import com.mr.home.entity.HomeEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("home")
@CrossOrigin
public class TestController {

    @RequestMapping("wangSbb")
    @ResponseBody
    public HomeEntity wangSbb(){

        HomeEntity homeEntity = new HomeEntity();
        homeEntity.setId("1");
        homeEntity.setName("wyf sbsb sbsbsb");
        return homeEntity;
    }
}
