package com.myp.cloud.eurekaclientadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients(basePackages = "com.myp.cloud.feigncommoninterface.interfaces")
public class EurekaClientAdminApplication {


    public static void main(String[] args) {
        SpringApplication.run(EurekaClientAdminApplication.class, args);
    }

}
