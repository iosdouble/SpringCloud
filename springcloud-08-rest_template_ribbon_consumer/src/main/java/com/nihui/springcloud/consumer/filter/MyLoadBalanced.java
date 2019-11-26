package com.nihui.springcloud.consumer.filter;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.*;

/**
 * @Classname MyLoadBalanced
 * @Description TODO
 * @Date 2019/11/26 9:43 AM
 * @Created by nihui
 */
@Target({ElementType.FIELD,ElementType.PARAMETER,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Qualifier
public @interface MyLoadBalanced {
}
