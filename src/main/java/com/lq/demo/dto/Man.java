package com.lq.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * User
 *
 * @author qingqing
 * @date 2025/2/16
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Man {
    private String idCard;
    private String name;
    private Integer age;
    private String phone;
    private List<Item> items;
    private Woman wife;
}
