package com.nihui.springcloud.demo5;


import com.netflix.hystrix.strategy.concurrency.HystrixRequestContext;
import com.nihui.springcloud.demo4.MyHystrixCommand;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class CacheApp {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		HystrixRequestContext context = HystrixRequestContext.initializeContext();
		String result = new MyHystrixCommand("nihui").execute();
		System.out.println(result);
		Future<String> future = new MyHystrixCommand("nihui").queue();
		System.out.println(future.get());
		context.shutdown();

	}
}
