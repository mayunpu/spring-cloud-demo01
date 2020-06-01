package com.myp.cloud.eurekaclientcommon;

import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class Admin {
    @Resource
    private DiscoveryClient discoveryClient;

    @GetMapping("test")
    public String get(){
        return discoveryClient.description();
    }
}
