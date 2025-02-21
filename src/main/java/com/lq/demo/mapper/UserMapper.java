package com.lq.demo.mapper;

import com.lq.demo.dto.Man;

/**
 * UserMapper
 *
 * @author qingqing
 * @date 2025/2/16
 */
public interface UserMapper {
    boolean addUser(Man user);

    boolean deleteUser(String Id);

    Man searchMan(String Id);

    Man searchWoman(String Id);

    boolean updateUser(Man user);
}
