package com.lq.demo.mapper;

import com.lq.demo.dto.Item;

import java.util.List;

/**
 * ItemMapper
 *
 * @author qingqing
 * @date 2025/2/17
 */
public interface ItemMapper {
    List<Item> listItem(String id);
}
