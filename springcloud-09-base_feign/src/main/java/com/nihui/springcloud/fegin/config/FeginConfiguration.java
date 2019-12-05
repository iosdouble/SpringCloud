package com.nihui.springcloud.fegin.config;

import com.nihui.springcloud.fegin.auth.FeignBasicAuthRequestInterceptor;
import feign.Logger;
import feign.Request;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.support.BasicAuthorizationInterceptor;

/**
 * @Classname FeginConfiguration
 * @Description TODO
 * @Date 2019/11/28 2:29 PM
 * @Created by nihui
 */
@Configuration
public class FeginConfiguration {

    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }


//    @Bean
//    public Contract feignContract(){
//        return new Contract.Default();
//    }


    @Bean
    public BasicAuthorizationInterceptor basicAuthorizationInterceptor(){
        return new BasicAuthorizationInterceptor("user","password");
    }

    @Bean
    public FeignBasicAuthRequestInterceptor basicAuthRequestInterceptor(){
        return new FeignBasicAuthRequestInterceptor();
    }

    @Bean
    public Request.Options options(){
        return new Request.Options(5000,1000);
    }
}
