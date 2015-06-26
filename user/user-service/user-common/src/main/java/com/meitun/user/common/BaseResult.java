package com.meitun.user.common;

/**
 * base result
 * Created by ldr on 2015/6/26.
 */
public class BaseResult<T> extends ToString {

    private static final long serialVersionUID = 8268306039066204425L;
    /**成功标识*/
    private boolean success;
    /**返回信息*/
    private String message;
    /**返回code*/
    private String code;
    /**返回数据*/
    private T data;
    /**错误信息*/
    private Throwable throwable;


    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }
}
