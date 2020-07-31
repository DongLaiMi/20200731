package com.edianzu.demo.service;

import com.edianzu.demo.model.User;

import java.util.List;

public interface UserService {
    List<User> findUsers();

    String sayHi(String name);
}
