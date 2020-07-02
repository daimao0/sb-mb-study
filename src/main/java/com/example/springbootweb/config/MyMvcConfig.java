package com.example.springbootweb.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@MapperScan("com.example.springbootweb.dao")
public class MyMvcConfig implements WebMvcConfigurer {

}