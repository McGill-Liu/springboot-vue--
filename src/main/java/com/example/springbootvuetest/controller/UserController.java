package com.example.springbootvuetest.controller;

import com.example.springbootvuetest.entity.User;
import com.example.springbootvuetest.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;

    @GetMapping("/helloWorld")
    public String hello() {
        System.out.println("hello world");
        return "hello world";
    }

    @GetMapping("/getAllUsers")
    public String getAllUsers() {
//        List<User> users = userMapper.selectList(null);
        List<User> users = userMapper.selectAllUsers();
        System.out.println(users);
        return "getAllUsers";
    }
}
