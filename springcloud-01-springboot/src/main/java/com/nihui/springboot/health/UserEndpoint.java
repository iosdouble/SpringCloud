package com.nihui.springboot.health;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Classname UserEndpoint
 * @Description TODO
 * @Date 2019/11/11 4:24 PM
 * @Created by nihui
 */
@Component
@Endpoint(id = "user")
public class UserEndpoint {
    @ReadOperation
    public List<Map<String,Object>> health(){
        List<Map<String,Object>> list = new ArrayList<>();
        Map<String,Object> map = new HashMap<>();
        map.put("userId",1000);
        map.put("userName","nihui");
        list.add(map);
        return list;
    }
}
