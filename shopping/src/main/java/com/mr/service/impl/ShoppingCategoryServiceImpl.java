package com.mr.service.impl;

import com.mr.dao.ShoppingCategoryDao;
import com.mr.entity.Shopping;
import com.mr.entity.ShoppingCategoryWithChildrenItem;
import com.mr.mapper.ShoppingCategoryMapper;
import com.mr.service.ShoppingCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author wjq
 * @Date 2020/1/13 18:42
 */
@Service
public class ShoppingCategoryServiceImpl implements ShoppingCategoryService {

    @Autowired
    private ShoppingCategoryMapper categoryMapper;
    @Autowired
    private ShoppingCategoryDao categoryDao;

    @Override
    public List<ShoppingCategoryWithChildrenItem> listCategoryWithChildrenItem() {
        return categoryDao.listWithChildren();
    }
}
