package com.nihui.springcloud.demo6;

import com.netflix.hystrix.strategy.concurrency.HystrixRequestContext;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class CollapserApp {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		HystrixRequestContext context = HystrixRequestContext.initializeContext();
		Future<String> f1 = new MyHystrixCollapser("nihui").queue();
		Future<String> f2 = new MyHystrixCollapser("nihui33").queue();
		System.out.println(f1.get()+"="+f2.get()); 	
		context.shutdown();

	}
}
