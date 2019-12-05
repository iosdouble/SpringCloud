package com.nihui.springcloud.fegin.auth;

import feign.RequestInterceptor;
import feign.RequestTemplate;

/**
 * @Classname FeignBasicAuthRequestInterceptor
 * @Description TODO
 * @Date 2019/11/28 5:11 PM
 * @Created by nihui
 */
public class FeignBasicAuthRequestInterceptor implements RequestInterceptor {

    public FeignBasicAuthRequestInterceptor() {
    }

    @Override
    public void apply(RequestTemplate template) {

        //业务代码
    }
}
