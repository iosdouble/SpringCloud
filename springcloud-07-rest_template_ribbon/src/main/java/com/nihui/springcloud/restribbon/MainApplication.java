package com.nihui.springcloud.restribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Classname MainApplication
 * @Description TODO
 * @Date 2019/11/25 2:48 PM
 * @Created by nihui
 */

@SpringBootApplication
@EnableDiscoveryClient
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class,args);
    }
}
