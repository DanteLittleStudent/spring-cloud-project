package com.springcloud.common.bean;

import java.io.Serializable;

/**
 * @author cuimin
 * create in 2022-05-16
 */
public class ControllerResultInfo<T> implements Serializable {

    private static final long serialVersionUID = 5713420767511383573L;
    /**
     * 返回值
     */
    private boolean result = false;

    /**
     * 状态码
     */
    private int code;

    /**
     * 返回信息
     */
    private String message;

    /**
     * 返回对象
     */
    private T data;

    public ControllerResultInfo(boolean result, int code, String message, T data) {
        this.result = result;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ControllerResultInfo(Integer code,String message){
        this(true, code,message,null);
    }

    public ControllerResultInfo() {
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
