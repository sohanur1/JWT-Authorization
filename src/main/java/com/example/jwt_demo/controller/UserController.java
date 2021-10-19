package com.example.jwt_demo.controller;

import com.example.jwt_demo.entity.User;
import com.example.jwt_demo.service.UserServicee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserServicee userServicee;

    @PostMapping("/users")
    public User saveUser(@RequestBody User user) {
        /*System.out.println("save user controller called");*/
        return userServicee.saveUser(user);
    }

    @GetMapping("/users")
    public List<User> fetchUser() {
        return userServicee.fetchUser();

    }
}
