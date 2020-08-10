package com.myp.cloud.eurekaclientadmin;

import com.myp.cloud.feigncommoninterface.interfaces.UserService;
import com.myp.cloud.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/seller")
public class Admin{
    @Autowired
    UserService userService;

    @GetMapping("test")
    public User get(){
        return userService.get();
    }
}
