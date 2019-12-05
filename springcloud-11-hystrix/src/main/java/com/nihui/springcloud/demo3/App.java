package com.nihui.springcloud.demo3;




/**
 * @Classname App
 * @Description TODO
 * @Date 2019/12/5 11:37 AM
 * @Created by nihui
 */
public class App {
    public static void main(String[] args) {
        String result = new MyHystrixCommand("nihui").execute();
        System.out.println(result);
    }
}
