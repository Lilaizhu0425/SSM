package com.lhz.controller;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(description = "controller层的返回值统一处理")
public class Result<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty("状态码")
    private int code = HttpStatus.SUCCESS;
    @ApiModelProperty("消息")
    private String msg;
    @ApiModelProperty("数据")
    private T data;

    public Result(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Result() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    /**
     * 这个是java声明泛型方法的固定格式，在方法的返回值声明之前的位置，<T>定义该方法所拥有的泛型标识符，个数可以是多个，比如
     *
     *
     * public static<T1,T2,T3> Response<T1> test(T2 t2,T3 t3){
     * }
     * 这样，在方法的返回值或者入参的地方，就可以使用“T”这个泛型。
     * 泛型标识符的名字可以是任意符合java规范的变量名，比如Map就使用<K,V>作为它的key和value的泛型标识符。
     */
    public static <T> Result<T> success() {
        return restResult(null, HttpStatus.SUCCESS, null);
    }

    public static <T> Result<T> success(T data) {
        return restResult(data, HttpStatus.SUCCESS, null);
    }

    public static <T> Result<T> success(T data, String msg) {
        return restResult(data, HttpStatus.SUCCESS, msg);
    }


    public static <T> Result<T> failed() {
        return restResult(null, HttpStatus.FAIL, null);
    }


    public static <T> Result<T> failed(int code, String msg) {
        return restResult(null, code, msg);
    }

    public static <T> Result<T> failed(String msg) {
        return restResult(null, HttpStatus.FAIL, msg);
    }


    public static <T> Result<T> restResult(T data, int code, String msg) {
        Result<T> apiResult = new Result<T>();
        apiResult.setCode(code);
        apiResult.setData(data);
        apiResult.setMsg(msg);
        return apiResult;
    }
}
