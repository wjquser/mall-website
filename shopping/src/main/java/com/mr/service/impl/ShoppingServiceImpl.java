package com.mr.service.impl;

import com.github.pagehelper.PageHelper;
import com.mr.entity.Shopping;
import com.mr.entity.ShoppingExample;
import com.mr.entity.ShoppingQueryParam;
import com.mr.mapper.ShoppingMapper;
import com.mr.service.ShoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class ShoppingServiceImpl implements ShoppingService {

    @Autowired
    private ShoppingMapper shoppingMapper;

    @Override
    public List<Shopping> list(ShoppingQueryParam shoppingQueryParam, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        ShoppingExample example = new ShoppingExample();
        ShoppingExample.Criteria criteria = example.createCriteria();
        criteria.andDeleteStatusEqualTo(0);
        if (shoppingQueryParam.getPublishStatus() != null) {
            criteria.andPublishStatusEqualTo(shoppingQueryParam.getPublishStatus());
        }
        if (shoppingQueryParam.getVerifyStatus() != null) {
            criteria.andVerifyStatusEqualTo(shoppingQueryParam.getVerifyStatus());
        }
        if (!StringUtils.isEmpty(shoppingQueryParam.getKeyword())) {
            criteria.andNameLike("%" + shoppingQueryParam.getKeyword() + "%");
        }
        if (!StringUtils.isEmpty(shoppingQueryParam.getProductSn())) {
            criteria.andProductSnEqualTo(shoppingQueryParam.getProductSn());
        }
        if (shoppingQueryParam.getBrandId() != null) {
            criteria.andBrandIdEqualTo(shoppingQueryParam.getBrandId());
        }
        if (shoppingQueryParam.getProductCategoryId() != null) {
            criteria.andProductCategoryIdEqualTo(shoppingQueryParam.getProductCategoryId());
        }
        return shoppingMapper.selectByExample(example);
    }
}
