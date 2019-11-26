package com.nihui.springcloud.consumer.config;

import com.nihui.springcloud.consumer.filter.MyLoadBalanced;
import com.nihui.springcloud.consumer.filter.MyLoadBalancerInterceptor;
import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Classname MyLoadBalancerAutoConfiguration
 * @Description TODO
 * @Date 2019/11/26 9:45 AM
 * @Created by nihui
 */
@Configuration
public class MyLoadBalancerAutoConfiguration {


    @MyLoadBalanced
    @Autowired(required = false)
    private List<RestTemplate> restTemplates = Collections.emptyList();


    @Bean
    public MyLoadBalancerInterceptor myLoadBalancerInterceptor(){
        return new MyLoadBalancerInterceptor();
    }

    @Bean
    public SmartInitializingSingleton myLoadBalancedRestTemplateInitializer(){
        return new SmartInitializingSingleton() {
            @Override
            public void afterSingletonsInstantiated() {
                for (RestTemplate restTemplate:MyLoadBalancerAutoConfiguration.this.restTemplates){
                    List<ClientHttpRequestInterceptor> list = new ArrayList<>(restTemplate.getInterceptors());
                    list.add(myLoadBalancerInterceptor());
                    restTemplate.setInterceptors(list);
                }
            }
        };
    }

}
