package com.meitun.user.common.exception;

/**
 * common exception
 * Created by ldr on 2015/6/29.
 */
public class CommonException extends RuntimeException {

    private String errorCode;

    public CommonException(String message){
        super(message);
    }

    public CommonException(String message,String code){
        super(message);
        this.errorCode = code;
    }

    public CommonException(String message,String code,Throwable throwable){
        super(message,throwable);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
