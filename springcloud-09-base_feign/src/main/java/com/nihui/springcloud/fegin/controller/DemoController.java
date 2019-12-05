package com.nihui.springcloud.fegin.controller;

import com.nihui.springcloud.fegin.remote.UserRemoteClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname DemoController
 * @Description TODO
 * @Date 2019/11/28 2:23 PM
 * @Created by nihui
 */
@RestController
public class DemoController {

    @Autowired
    private UserRemoteClient userRemoteClient;

    @GetMapping("/callHello")
    public String callHello(){
        String result = userRemoteClient.hello();
        System.out.println("调用结果："+result);
        return result;
    }
}
