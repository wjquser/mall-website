package com.mr.controller;

import com.mr.common.utils.CommonResult;
import com.mr.entity.Brand;
import com.mr.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author wjq
 * @Date 2020/1/13 16:21
 */
@Controller
@RequestMapping(value = "brand")
public class BrandController {

    @Autowired
    private BrandService brandService;

    @GetMapping(value = "listAll")
    @ResponseBody
    public CommonResult<List<Brand>> listAll(){
        return CommonResult.success(brandService.listAllBrand());
    }
}
