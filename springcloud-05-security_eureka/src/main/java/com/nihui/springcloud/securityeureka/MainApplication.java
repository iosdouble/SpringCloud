package com.nihui.springcloud.securityeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Classname MainApplication
 * @Description TODO
 * @Date 2019/11/12 7:21 PM
 * @Created by nihui
 */
@EnableEurekaServer
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class,args);
    }
}
