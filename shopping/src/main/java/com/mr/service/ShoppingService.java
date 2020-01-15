package com.mr.service;

import com.mr.entity.Shopping;
import com.mr.entity.ShoppingQueryParam;

import java.util.List;

public interface ShoppingService {
    List<Shopping> list(ShoppingQueryParam shoppingQueryParam, Integer pageSize, Integer pageNum);
}
