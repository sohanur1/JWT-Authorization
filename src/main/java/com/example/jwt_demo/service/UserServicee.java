package com.example.jwt_demo.service;

import com.example.jwt_demo.entity.User;

import java.util.List;

public interface UserServicee {


    public List<User> fetchUser();

    User saveUser(User user);
}
