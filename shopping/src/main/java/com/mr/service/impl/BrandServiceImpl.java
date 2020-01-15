package com.mr.service.impl;

import com.mr.entity.Brand;
import com.mr.entity.BrandExample;
import com.mr.mapper.BrandMapper;
import com.mr.mapper.ShoppingMapper;
import com.mr.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author wjq
 * @Date 2020/1/13 16:26
 */
@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandMapper brandMapper;

    @Autowired
    private ShoppingMapper shoppingMapper;

    @Override
    public List<Brand> listAllBrand() {
        return brandMapper.selectByExample(new BrandExample());
    }
}
