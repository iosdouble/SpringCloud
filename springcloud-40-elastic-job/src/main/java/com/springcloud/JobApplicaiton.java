package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ImportResource;

import java.util.concurrent.CountDownLatch;

/**
 * @Classname elasticjob
 * @Description TODO
 * @Date 2019/12/20 5:20 PM
 * @Created by nihui
 */
@ImportResource(locations = {"classpath:applicationContext.xml"})
@SpringBootApplication
public class JobApplicaiton {
    public static void main(String[] args) {
        new SpringApplicationBuilder().sources(JobApplicaiton.class)
                .web(WebApplicationType.NONE).run(args);
        try{
            new CountDownLatch(1).await();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

