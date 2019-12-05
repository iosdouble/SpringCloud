package com.nihui.springboot.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @Classname LogServiceImpl
 * @Description TODO
 * @Date 2019/11/28 10:34 AM
 * @Created by nihui
 */
@Service
public class LogServiceImpl implements LogService {

    @Async
    @Override
    public void saveLog() {
        System.out.println(Thread.currentThread().getName());
    }
}
