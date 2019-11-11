package com.nihui.springboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Classname MyConfig
 * @Description TODO
 * @Date 2019/11/11 4:02 PM
 * @Created by nihui
 */
@ConfigurationProperties(prefix = "nihui")
@Component
public class MyConfig {
    private String hello;
    private Integer port;
    private String name;


    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
