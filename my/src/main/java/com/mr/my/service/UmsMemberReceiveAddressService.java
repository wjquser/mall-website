package com.mr.my.service;


import com.mr.my.entity.Address;
import com.mr.my.utils.ResultVO;

/**
 * 用户地址管理Service
 * Created by macro on 2018/8/28.
 */
public interface UmsMemberReceiveAddressService {
    ResultVO list(Address address);

    ResultVO update(Long id);

    int add(Address address);

    int delect(Long id);

    int updatelist(Address address);


    /**
     * 返回当前用户的收货地址
     */
 


}
