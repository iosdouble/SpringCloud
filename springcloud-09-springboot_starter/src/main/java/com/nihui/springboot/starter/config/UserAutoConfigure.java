package com.nihui.springboot.starter.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Classname UserAutoConfigure
 * @Description TODO
 * @Date 2019/11/28 11:09 AM
 * @Created by nihui
 */
@Configuration
@EnableConfigurationProperties(UserProperties.class)
public class UserAutoConfigure {
    @Bean
    @ConditionalOnProperty(prefix = "spring.user",value = "enabled",havingValue = "true")
    public UserClient userClient(UserProperties userProperties){
        return new UserClient(userProperties);
    }
}
