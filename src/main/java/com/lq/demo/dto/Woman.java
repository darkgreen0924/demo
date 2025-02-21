package com.lq.demo.dto;

import lombok.Data;

import java.util.List;

/**
 * woman
 *
 * @author qingqing
 * @date 2025/2/17
 */

@Data
public class Woman {
    private String idCard;
    private String name;
    private Integer age;
    private String phone;
    private List<Item> items;
    private Man husband;
}
