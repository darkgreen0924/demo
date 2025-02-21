package com.lq.demo.common;

import lombok.Data;

/**
 * Result
 *
 * @author qingqing
 * @date 2025/2/16
 */

@Data
public class Result<T> {
    // 状态码
    private Long code;

    // 返回信息
    private String message;

    // 返回数据
    private T data;

    protected Result() {
    }


    protected Result(Long code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 成功返回结果
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Result<T> success(T data) {
        return new Result<>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(), data);
    }

    /**
     * 成功返回结果
     *
     * @param message
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Result<T> success(String message, T data) {
        return new Result<>(ResultCode.SUCCESS.getCode(), message, data);
    }

    /**
     * 失败返回结果
     *
     * @param message
     * @param <T>
     * @return
     */
    public static <T> Result<T> fail(String message) {
        return new Result<>(ResultCode.FAIL.getCode(), message, null);
    }
}

