package com.nihui.springboot.controller;

import com.nihui.springboot.config.MyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname HelloController
 * @Description TODO
 * @Date 2019/11/11 3:54 PM
 * @Created by nihui
 */
@RestController
public class HelloController {

    @Autowired
    Environment environment;

    @Value("${nihui.hello}")
    String sayHello;

    @Autowired
    MyConfig myConfig;

    @GetMapping("/hello")
    public String hello(){
        String port = environment.getProperty("nihui.port");
        return "Hello World! "+ port+"   "+ sayHello+"    "+myConfig.getName() ;
    }
}
