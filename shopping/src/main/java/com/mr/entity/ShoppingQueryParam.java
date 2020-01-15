package com.mr.entity;


import lombok.Data;

/**
 * 产品查询参数
 * Created by macro on 2018/4/27.
 */
@Data
public class ShoppingQueryParam {
    private Integer publishStatus;
    private Integer verifyStatus;
    private String keyword;
    private String productSn;
    private Long productCategoryId;
    private Long brandId;
}
