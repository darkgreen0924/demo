package com.lq.demo.service;

import com.lq.demo.dto.Man;

import java.util.concurrent.ExecutionException;

/**
 * UserService
 *
 * @author qingqing
 * @date 2025/2/16
 */

public interface UserService {
    boolean addUser(Man user);

    boolean deleteUser(String id);

    Man searchUser(String id) throws ExecutionException, InterruptedException;

    Man searchUser2(String id);

    boolean updateUser(Man user);
}
