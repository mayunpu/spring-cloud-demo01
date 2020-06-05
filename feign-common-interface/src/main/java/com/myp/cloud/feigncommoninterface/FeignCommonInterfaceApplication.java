package com.myp.cloud.feigncommoninterface;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients()
public class FeignCommonInterfaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignCommonInterfaceApplication.class, args);
    }

}
