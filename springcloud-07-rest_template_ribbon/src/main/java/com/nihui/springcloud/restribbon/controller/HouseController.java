package com.nihui.springcloud.restribbon.controller;

import com.nihui.springcloud.restribbon.bean.HouseInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname HouseController
 * @Description TODO
 * @Date 2019/11/25 2:51 PM
 * @Created by nihui
 */
@RestController
public class HouseController {

    @GetMapping("/house/data")
    public HouseInfo getData(@RequestParam(name = "name") String name){
        return new HouseInfo(1L,"北京","朝阳","花园小区");
    }

    @GetMapping("/house/data/{name}")
    public String getName(@PathVariable(name = "name")String name){
        return name;
    }
}
