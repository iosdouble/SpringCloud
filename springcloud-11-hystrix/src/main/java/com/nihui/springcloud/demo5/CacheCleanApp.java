package com.nihui.springcloud.demo5;

import com.netflix.hystrix.strategy.concurrency.HystrixRequestContext;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class CacheCleanApp {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		HystrixRequestContext context = HystrixRequestContext.initializeContext();
		String result = new ClearCacheHystrixCommand("nihui").execute();
		System.out.println(result);
		ClearCacheHystrixCommand.flushCache("nihui");
		Future<String> future = new ClearCacheHystrixCommand("nihui").queue();
		System.out.println(future.get());
		context.shutdown();

	}
}
