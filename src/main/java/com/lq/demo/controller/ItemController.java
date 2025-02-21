package com.lq.demo.controller;

import com.lq.demo.common.Result;
import com.lq.demo.dto.Item;
import com.lq.demo.mapper.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ItemController
 *
 * @author qingqing
 * @date 2025/2/17
 */

@RestController
public class ItemController {
    private ItemMapper itemMapper;

    @Autowired
    public ItemController(ItemMapper itemMapper) {
        this.itemMapper = itemMapper;
    }

    @GetMapping("/item/{id}")
    public Result<List<Item>> listItem(@PathVariable("id") String id) {
        return Result.success(itemMapper.listItem(id));
    }
}
