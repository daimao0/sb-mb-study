package com.example.springbootweb.service.impl;

import com.example.springbootweb.dao.UserDao;
import com.example.springbootweb.pojo.User;
import com.example.springbootweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:daMao
 * @Date: Created in 0:21 2020/7/3
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }

    @Override
    public int insertUser(User user) {
        return userDao.insertUser(user);
    }
}
