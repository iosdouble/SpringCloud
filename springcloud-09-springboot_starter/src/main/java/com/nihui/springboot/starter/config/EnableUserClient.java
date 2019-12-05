package com.nihui.springboot.starter.config;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @Classname EnableUserClient
 * @Description TODO
 * @Date 2019/11/28 11:14 AM
 * @Created by nihui
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({UserAutoConfigure.class})
public @interface EnableUserClient {
}
