package com.mr.dao;

import com.mr.entity.ShoppingCategoryWithChildrenItem;

import java.util.List;

/**
 * 商品分类自定义Dao
 * Created by macro on 2018/5/25.
 */
public interface ShoppingCategoryDao {
    List<ShoppingCategoryWithChildrenItem> listWithChildren();
}
