package com.mr.controller;

import com.mr.common.utils.CommonResult;
import com.mr.entity.Shopping;
import com.mr.entity.ShoppingQueryParam;
import com.mr.service.ShoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "shopping")
public class ShoppingController {

    @Autowired
    private ShoppingService shoppingService;

    //查询商品
    @GetMapping(value = "list")
    @ResponseBody
    public CommonResult list(ShoppingQueryParam shoppingQueryParam,
                             @RequestParam(value = "pageSize",defaultValue = "5") Integer pageSize,
                             @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum
                            ){
        List<Shopping> shoppingList = shoppingService.list(shoppingQueryParam,pageSize,pageNum);
        return CommonResult.success(shoppingList);
    }
}
