package com.mr.my.mapper;

import com.mr.my.entity.Address;
import com.mr.my.utils.ResultVO;


import java.util.List;

public interface AddressMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Address record);

    int insertSelective(Address record);

    Address selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Long record);

    int updateByPrimaryKey(Address record);
    /**
     * 获取全部收货地址
     * @param address
     * @return
     */
    List<Address> list(Address address);


    ResultVO update(Long id);
}