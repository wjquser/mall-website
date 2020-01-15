package com.mr.controller;

import com.mr.common.utils.CommonResult;
import com.mr.entity.ShoppingCategory;
import com.mr.entity.ShoppingCategoryWithChildrenItem;
import com.mr.service.ShoppingCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author wjq
 * @Date 2020/1/13 18:40
 */
@Controller
@RequestMapping(value = "category")
public class ShoppingCategoryController {

    @Autowired
    private ShoppingCategoryService categoryService;

    //查询所有分类
    @GetMapping(value = "list/withChildren")
    @ResponseBody
    public CommonResult<List<ShoppingCategoryWithChildrenItem>> listCategoryWithChildrenItem(){
        return CommonResult.success(categoryService.listCategoryWithChildrenItem());
    }
}
