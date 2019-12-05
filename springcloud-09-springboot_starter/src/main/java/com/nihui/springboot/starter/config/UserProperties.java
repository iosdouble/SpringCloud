package com.nihui.springboot.starter.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Classname UserProperties
 * @Description TODO
 * @Date 2019/11/28 11:06 AM
 * @Created by nihui
 */
@Data
@ConfigurationProperties(prefix = "spring.user")
public class UserProperties {
    private String name;
}
