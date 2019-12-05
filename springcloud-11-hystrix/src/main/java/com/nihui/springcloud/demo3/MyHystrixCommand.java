package com.nihui.springcloud.demo3;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixCommandProperties;

/**
 * @Classname MyHystrixCommand
 * @Description TODO
 * @Date 2019/12/5 11:49 AM
 * @Created by nihui
 */
public class MyHystrixCommand extends HystrixCommand<String> {
    private final String name;

    public MyHystrixCommand(String name) {
        super(HystrixCommand.Setter
                .withGroupKey(HystrixCommandGroupKey.Factory.asKey("MyGroup"))
                .andCommandPropertiesDefaults(HystrixCommandProperties.Setter()
                .withExecutionIsolationStrategy(HystrixCommandProperties.ExecutionIsolationStrategy.SEMAPHORE)));
        this.name = name;
    }

    protected String run() throws Exception {
        System.err.println("get data");
        return this.name + ":" + Thread.currentThread().getName();
    }
}
