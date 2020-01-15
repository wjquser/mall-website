package com.mr.my.controller;

import com.mr.my.entity.Address;
import com.mr.my.service.UmsMemberReceiveAddressService;
import com.mr.my.utils.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("my")
public class MyController {

    @Autowired
    private UmsMemberReceiveAddressService memberReceiveAddressService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResultVO list(Address address){

        return memberReceiveAddressService.list(address);
    }

    @GetMapping(value = "/update" )
    public ResultVO update( Long id){
        return memberReceiveAddressService.update(id);
    }
    @RequestMapping(value = "/add")
    public int add(Address address){

        return memberReceiveAddressService.add(address);
    }
    @RequestMapping(value = "/delect")
    public int delect(Long id){
        return memberReceiveAddressService.delect(id);
    }

    @RequestMapping(value = "/updatelist")
    public int updatelist(Address address){

        return memberReceiveAddressService.updatelist(address);
    }
}
