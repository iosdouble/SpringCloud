package com.nihui.springcloud.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Classname ArticleController
 * @Description TODO
 * @Date 2019/11/11 5:49 PM
 * @Created by nihui
 */
@RestController
public class ArticleController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/sayHello1")
    public String sayHello1(){
//        return restTemplate.getForObject("http://localhost:8081/user/hello",String.class);
//        return restTemplate.getForObject("http://10.2.121.14:8081/user/hello",String.class);
        return restTemplate.getForObject("http://eureka-client-user-service/user/hello",String.class);
    }

    @GetMapping("/sayHello2")
    public String sayHello2(){
        return restTemplate.getForObject("http://eureka-client-user-service/user/hello",String.class);
    }

}
