package com.lq.demo.controller;

import com.lq.demo.common.Result;
import com.lq.demo.dto.Man;
import com.lq.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

/**
 * UserMapper.xml
 *
 * @author qingqing
 * @date 2025/2/16
 */

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/search/{id}")
    public Result<Man> searchUser(@PathVariable("id") String id) throws ExecutionException, InterruptedException {
        Man user = userService.searchUser(id);
        return Result.success(user);
    }

    @GetMapping("/search2/{id}")
    public Result<Man> searchUser2(@PathVariable("id") String id) {
        Man user = userService.searchUser2(id);
        return Result.success(user);
    }

    @GetMapping("/search")
    public Result searchUser() {
        return Result.success("abc");
    }

    @DeleteMapping("/search/{id}")
    public Result<Boolean> deleteUser(@PathVariable("id") String id) {
        boolean b = userService.deleteUser(id);
        return Result.success(b);
    }

}
