package com.example.springbootweb;

import com.example.springbootweb.pojo.User;
import com.example.springbootweb.service.UserService;
import com.example.springbootweb.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootWebApplicationTests {
    @Autowired
    UserServiceImpl userServiceImpl;
    @Test
    void contextLoads() {
    }

    @Test
    public void getUser(){
        User user = userServiceImpl.getUserById(1L);
        System.out.println(user);

        User user1 = new User();
        user1.setId(2L);
        user1.setName("张三");
        user1.setPassword("adfadsf");
        System.out.println(userServiceImpl.insertUser(user1));

    }
}
