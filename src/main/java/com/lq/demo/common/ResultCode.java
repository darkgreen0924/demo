package com.lq.demo.common;

/**
 * ResultCode
 *
 * @author qingqing
 * @date 2025/2/16
 */

public enum ResultCode {
    SUCCESS(200L, "操作成功"),
    FAIL(500L, "操作成功"),
    VALIDATE_FAILED(200L, "操作成功"),
    FORBIDDEN(403L, "操作成功");


    private Long code;
    private String message;

    ResultCode(Long code, String message) {
        this.code = code;
        this.message = message;
    }

    public Long getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
