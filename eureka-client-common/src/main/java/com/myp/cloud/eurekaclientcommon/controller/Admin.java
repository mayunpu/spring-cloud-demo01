package com.myp.cloud.eurekaclientcommon.controller;

import com.myp.cloud.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@Slf4j
@RequestMapping("admin")
public class Admin {
    @GetMapping("get")
    public User get(){
        log.error("小明");
        return new User(11,"小明",new Date());
    }
}
