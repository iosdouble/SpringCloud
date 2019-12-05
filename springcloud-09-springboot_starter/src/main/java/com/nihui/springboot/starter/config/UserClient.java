package com.nihui.springboot.starter.config;

import com.nihui.springboot.starter.config.UserProperties;

/**
 * @Classname UserClient
 * @Description TODO
 * @Date 2019/11/28 11:08 AM
 * @Created by nihui
 */
public class UserClient {
    private UserProperties userProperties;

    public UserClient() {
    }

    public UserClient(UserProperties userProperties) {
        this.userProperties = userProperties;
    }

    public String getName(){
        return userProperties.getName();
    }
}
