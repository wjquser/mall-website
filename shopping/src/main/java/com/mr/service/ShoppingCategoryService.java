package com.mr.service;

import com.mr.entity.ShoppingCategoryWithChildrenItem;

import java.util.List;

/**
 * @Author wjq
 * @Date 2020/1/13 18:42
 */
public interface ShoppingCategoryService {
    List<ShoppingCategoryWithChildrenItem> listCategoryWithChildrenItem();
}
