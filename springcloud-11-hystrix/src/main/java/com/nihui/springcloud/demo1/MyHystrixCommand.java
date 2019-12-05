package com.nihui.springcloud.demo1;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;

/**
 * @Classname MyHystrixCommand
 * @Description TODO
 * @Date 2019/12/5 11:33 AM
 * @Created by nihui
 */
public class MyHystrixCommand extends HystrixCommand<String> {

    private final String name;
    protected MyHystrixCommand(String name) {
        super(HystrixCommandGroupKey.Factory.asKey("MyGroup"));
        this.name = name;
    }

    protected String run() throws Exception {
        return this.name+":"+Thread.currentThread().getName();
    }
}
