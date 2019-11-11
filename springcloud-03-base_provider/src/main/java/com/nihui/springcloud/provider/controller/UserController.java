package com.nihui.springcloud.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname UserController
 * @Description TODO
 * @Date 2019/11/11 5:37 PM
 * @Created by nihui
 */
@RestController
public class UserController {
    @GetMapping("/user/hello")
    public String userHell(){
        return "User Hello";
    }
}
