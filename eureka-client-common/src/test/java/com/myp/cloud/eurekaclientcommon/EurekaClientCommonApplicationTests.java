package com.myp.cloud.eurekaclientcommon;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.discovery.DiscoveryClient;

import javax.annotation.Resource;

@SpringBootTest
class EurekaClientCommonApplicationTests {

    @Resource
    DiscoveryClient discoveryClient;
    @Test
    void contextLoads() {
        System.out.println(discoveryClient.getServices());
    }

}
