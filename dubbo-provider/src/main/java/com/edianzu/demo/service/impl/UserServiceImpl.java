package com.edianzu.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.edianzu.demo.model.User;
import com.edianzu.demo.service.UserService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
@Service(interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {
    @Override
    public List<User> findUsers() {
        List<User> userList = new ArrayList<>();
        userList.add(new User(1,"孙尚香",20));
        userList.add(new User(2,"黄忠",30));
        userList.add(new User(3,"后羿",25));
        return userList;
    }

    @Override
    public String sayHi(String name) {
        return "hello,dubbo!";
    }
}
