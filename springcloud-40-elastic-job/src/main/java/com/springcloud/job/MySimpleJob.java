package com.springcloud.job;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Classname MySimpleJob
 * @Description TODO
 * @Date 2019/12/20 5:34 PM
 * @Created by nihui
 */
public class MySimpleJob implements SimpleJob {
    @Override
    public void execute(ShardingContext shardingContext) {
        String time = new SimpleDateFormat("HH:mm:ss").format(new Date());
        System.out.println(time + "开始执行简单任务");
    }
}
