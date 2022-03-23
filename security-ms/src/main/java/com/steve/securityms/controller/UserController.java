package com.steve.securityms.controller;

import com.steve.securityms.entity.User;
import com.steve.securityms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/validateUser")
    public String validateUser(@RequestBody User user){
        return service.login(user).getToken();
    }

    @PostMapping("/insertUser")
    public User insertUser(@RequestBody User user){
           user.setToken(validateUser(user));
           return service.createUser(user);
    }
}
