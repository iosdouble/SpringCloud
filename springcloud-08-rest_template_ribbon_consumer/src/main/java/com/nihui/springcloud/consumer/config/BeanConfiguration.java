package com.nihui.springcloud.consumer.config;

import com.nihui.springcloud.consumer.filter.MyLoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Classname BeanConfiguration
 * @Description TODO
 * @Date 2019/11/25 2:49 PM
 * @Created by nihui
 */
@Configuration
public class BeanConfiguration {

    @Bean
//    @LoadBalanced
    @MyLoadBalanced
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }
}
