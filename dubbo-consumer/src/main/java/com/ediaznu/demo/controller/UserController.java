package com.ediaznu.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.edianzu.demo.model.User;
import com.edianzu.demo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class UserController {
    //此处如果注明版本version,一直会报错,去掉了就没有报错
    @Reference(url="dubbo://127.0.0.1:20880")
    private UserService userService;

    @RequestMapping("/hello")
    public Object sayHi(String name){
        return userService.sayHi("cpx");
    }

    @RequestMapping("/findUsers")
    public List<User> findUsers(){
        return userService.findUsers();
    }

    @RequestMapping("/test")
    public Object test(String name){
        return userService.sayHi("test");
    }
}
