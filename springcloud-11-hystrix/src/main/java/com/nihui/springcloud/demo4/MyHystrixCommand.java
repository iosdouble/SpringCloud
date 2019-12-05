package com.nihui.springcloud.demo4;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixCommandProperties;
import com.netflix.hystrix.HystrixThreadPoolProperties;

public class MyHystrixCommand extends HystrixCommand<String> {

	private final String name;

	public MyHystrixCommand(String name) {
		 super(Setter.withGroupKey(
		           HystrixCommandGroupKey.Factory.asKey("MyGroup"))                 
		         .andCommandPropertiesDefaults(     
		             HystrixCommandProperties.Setter()     
		             .withExecutionIsolationStrategy(      
		               HystrixCommandProperties.ExecutionIsolationStrategy.THREAD 
		             )                 
		         ).andThreadPoolPropertiesDefaults(    
		             HystrixThreadPoolProperties.Setter()      
		               .withCoreSize(10)                
		 	       .withMaxQueueSize(100)          
		       	       .withMaximumSize(100)               
		         )         
		);       


		this.name = name;
	}

	@Override
	protected String run() {
		System.err.println("get data");   
		return this.name + ":" + Thread.currentThread().getName();
	}

	@Override
	protected String getFallback() {
		return "失败了";
	}

	@Override
	protected String getCacheKey() {
		return String.valueOf(this.name);
	}
}
