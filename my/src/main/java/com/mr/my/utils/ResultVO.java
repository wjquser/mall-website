package com.mr.my.utils;


import com.mr.common.utils.page.PageUtil;
import com.mr.my.entity.Address;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Setter
@Getter
public class ResultVO extends PageUtil {

    private Integer errorCode = 0;//返回状态1：error 0：success

    private String errorMsg = "";//描述信息

    private int total;//数据总数

    private Object data;

    public ResultVO(Integer errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public ResultVO(Integer errorCode, String errorMsg, Object data) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.data = data;
    }

    private List<Address> AddressList;

    public ResultVO() {

    }
}