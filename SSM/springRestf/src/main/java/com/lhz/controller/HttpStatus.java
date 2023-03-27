package com.lhz.controller;

/**
 * request请求返回的状态码
 */
public interface HttpStatus {
    /**
     * 接口成功
     */
    int SUCCESS = 200;
    /**
     * 接口失败 fail，发生异常
     */
    int FAIL = 500;
    /**
     * 系统内部错误
     */
    public static final int ERROR = 500;
    /**
     * 未登录UnAuthorized，前端看到code为401，设置重定向地址
     */
    int UNAUTHORIZED=401;
    /**
     * 找不到该请求
     */
    int NOT_FOUND = 404;
    /**
     * 非法签名sign_fail_cde
     */
    Integer SIGN_FAIL_CODE = 405;

    /**
     * 对象创建成功
     */
    public static final int CREATED = 201;

    /**
     * 请求已经被接受
     */
    public static final int ACCEPTED = 202;

    /**
     * 操作已经执行成功，但是没有返回数据
     */
    public static final int NO_CONTENT = 204;

    /**
     * 资源已被移除
     */
    public static final int MOVED_PERM = 301;

    /**
     * 重定向
     */
    public static final int SEE_OTHER = 303;

    /**
     * 资源没有被修改
     */
    public static final int NOT_MODIFIED = 304;

    /**
     * 参数列表错误（缺少，格式不匹配）
     */
    public static final int BAD_REQUEST = 400;
}
