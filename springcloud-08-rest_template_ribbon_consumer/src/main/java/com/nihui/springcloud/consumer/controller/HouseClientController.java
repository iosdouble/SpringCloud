package com.nihui.springcloud.consumer.controller;

import com.nihui.springcloud.consumer.bean.HouseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Classname HouseClientController
 * @Description TODO
 * @Date 2019/11/25 3:28 PM
 * @Created by nihui
 */
@RestController
public class HouseClientController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/call/data")
    public HouseInfo getData(@RequestParam("name") String name){
//        return restTemplate.getForObject("http://localhost:8081/house/data?name="+name,HouseInfo.class);
        return restTemplate.getForObject("http://eureka-client-house-service/house/data?name="+name,HouseInfo.class);
    }

    @GetMapping("/call/data/{name}")
    public String getData2(@PathVariable("name") String name){
        return restTemplate.getForObject("http://eureka-client-house-service/house/data/{name}",String.class,name);
//        return restTemplate.getForObject("http://localhost:8081/house/data/{name}",String.class,name);
    }

}
