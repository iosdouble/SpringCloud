package com.nihui.springboot.health;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

/**
 * @Classname UserHealthIndicator
 * @Description TODO
 * @Date 2019/11/11 4:21 PM
 * @Created by nihui
 */
@Component
public class UserHealthIndicator extends AbstractHealthIndicator {
    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        builder.up().withDetail("status",true);


    }
}
