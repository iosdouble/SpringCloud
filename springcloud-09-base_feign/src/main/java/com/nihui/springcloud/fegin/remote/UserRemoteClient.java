package com.nihui.springcloud.fegin.remote;

import com.nihui.springcloud.fegin.config.FeginConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Classname UserRemoteClient
 * @Description TODO
 * @Date 2019/11/28 1:53 PM
 * @Created by nihui
 */
@FeignClient(value = "eureka-client-user-service",configuration = FeginConfiguration.class)
public interface UserRemoteClient {

    @GetMapping("/user/hello")
    public String hello();

}
