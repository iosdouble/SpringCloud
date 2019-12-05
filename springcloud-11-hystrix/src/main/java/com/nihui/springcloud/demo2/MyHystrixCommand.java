package com.nihui.springcloud.demo2;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;

import java.util.concurrent.TimeUnit;

/**
 * @Classname MyHystrixCommand
 * @Description TODO
 * @Date 2019/12/5 11:42 AM
 * @Created by nihui
 */
public class MyHystrixCommand extends HystrixCommand<String> {
    private final String name;

    public MyHystrixCommand(String name) {
        super(HystrixCommandGroupKey.Factory.asKey("MyGroup"));
        this.name = name;
    }

    protected String run() throws Exception {
        try {
            TimeUnit.SECONDS.sleep(10);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return this.name + ":" + Thread.currentThread().getName();
    }

    @Override
    protected String getFallback() {
        return "调失败";
    }
}
