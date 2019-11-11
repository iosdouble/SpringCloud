package com.nihui.springcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Classname EurekaApplicaiton
 * @Description TODO
 * @Date 2019/11/11 4:57 PM
 * @Created by nihui
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaApplicaiton {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplicaiton.class,args);
    }
}
