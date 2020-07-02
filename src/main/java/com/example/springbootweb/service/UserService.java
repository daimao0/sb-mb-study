package com.example.springbootweb.service;

import com.example.springbootweb.pojo.User;

/**
 * @Author:daMao
 * @Date: Created in 0:09 2020/7/3
 */
public interface UserService {
    User getUserById(Long id);
    int insertUser(User user);
}
