package com.mr.my.service.imp;


import com.mr.my.entity.Address;
import com.mr.my.mapper.AddressMapper;
import com.mr.my.service.UmsMemberReceiveAddressService;
import com.mr.my.utils.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户地址管理Service实现类
 * Created by macro on 2018/8/28.
 */
@Service("UmsMemberReceiveAddressService")
public class UmsMemberReceiveAddressServiceImpl implements UmsMemberReceiveAddressService {

    @Autowired
    private AddressMapper addressMapper;


    @Override
    public ResultVO list(Address address) {
        List<Address> lists = addressMapper.list(address);
        ResultVO resultVO = new ResultVO();
        resultVO.setAddressList(lists);
        return resultVO;
    }

    @Override
    public ResultVO update(Long id) { ;

        return addressMapper.update(id);
    }

    @Override
    public int add(Address address) {



        return addressMapper.insert(address);
    }

    @Override
    public int delect(Long id) {


        return addressMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updatelist(Address address) {


        return addressMapper.updateByPrimaryKey(address);
    }




}
