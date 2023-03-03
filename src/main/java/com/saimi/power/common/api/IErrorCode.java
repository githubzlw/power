package com.saimi.power.common.api;

/**
 * 封装API的错误码
 * Created by saimi on 2022/4/19.
 */
public interface IErrorCode {
    long getCode();

    String getMessage();
}
