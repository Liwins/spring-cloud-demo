package com.liwin.common.exception;

import com.liwin.common.api.IErrorCode;

/**
 *
 * 断言处理类，用于抛出各种API异常
 * @author riversky
 * @date 2020/11/23
 **/
public class Asserts {
    public static void fail(String message) {
        throw new ApiException(message);
    }

    public static void fail(IErrorCode errorCode) {
        throw new ApiException(errorCode);
    }
}
