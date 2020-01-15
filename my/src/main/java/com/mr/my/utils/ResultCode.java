package com.mr.my.utils;

/**
 * 枚举了一些常用API操作码
 * Created by macro on 2019/4/19.
 */
public enum ResultCode implements IErrorCode {

    SUCCESS(200,"请求成功"),
    NETERROR(201,"网络异常"),
    AUTHENERROR(202,"鉴权异常"),
    PARAMETERERROR(203,"参数异常");

    private long errorCode;
    private String errorMsg;

    ResultCode(long errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    @Override
    public long getCode() {
        return errorCode;
    }

    @Override
    public String getMessage() {
        return errorMsg;
    }
}
