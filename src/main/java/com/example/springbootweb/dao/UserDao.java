package com.example.springbootweb.dao;

import com.example.springbootweb.pojo.User;

/**
 * @Author:daMao
 * @Date: Created in 0:10 2020/7/3
 */

public interface UserDao {

    User getUserById(Long Id);

    int insertUser(User user);
}
