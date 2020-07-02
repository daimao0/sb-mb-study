package com.example.springbootweb.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @Author:daMao
 * @Date: Created in 10:54 2020/5/11
 */
@RestController
@RequestMapping("/index")
public class IndexController {

    @GetMapping("/hello")
    public String index() {
        return "hello";
    }
    @PostMapping("/hello2")
    public String hello2() {
        return "hello2";
    }
    @PostMapping("/hello3")
    public String hello3(@RequestParam String name) {
        return "hello3"+name;
    }
}
