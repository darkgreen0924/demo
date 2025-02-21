package com.lq.demo.service.impl;

import com.lq.demo.dto.Man;
import com.lq.demo.mapper.UserMapper;
import com.lq.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UserServiceImpl
 *
 * @author qingqing
 * @date 2025/2/16
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean addUser(Man user) {
        return false;
    }

    @Override
    public boolean deleteUser(String id) {
        boolean b = userMapper.deleteUser(id);
        return b;
    }

    @Override
    public Man searchUser(String id) {
        return userMapper.searchMan(id);
    }

    @Override
    public boolean updateUser(Man user) {
        return false;
    }
}
