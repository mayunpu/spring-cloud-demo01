package com.myp.cloud.feigncommoninterface.interfaces;

import com.myp.cloud.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "eureka-client-common")
@RequestMapping("admin")
public interface UserService {
    @RequestMapping("get")
    User get();
}
