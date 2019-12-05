package com.nihui.springcloud.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Classname UserRemoteClient
 * @Description TODO
 * @Date 2019/11/28 5:47 PM
 * @Created by nihui
 */
@FeignClient("feign-provide")
public interface UserRemoteClient {
    @GetMapping("/user/name")
    String getName();
}
