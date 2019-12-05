package com.nihui.springcloud.demo1;

import java.util.concurrent.Future;

/**
 * @Classname App
 * @Description TODO
 * @Date 2019/12/5 11:37 AM
 * @Created by nihui
 */
public class App {
//    public static void main(String[] args) {
//        String result = new MyHystrixCommand("nihui").execute();
//        System.out.println(result);
//    }

    public static void main(String[] args) {
        Future<String> result = new MyHystrixCommand("nihui").queue();
        System.out.println(result);
    }
}
