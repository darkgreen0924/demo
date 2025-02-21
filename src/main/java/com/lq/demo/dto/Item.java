package com.lq.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Item
 *
 * @author qingqing
 * @date 2025/2/16
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    private String id;
    private String name;
}
