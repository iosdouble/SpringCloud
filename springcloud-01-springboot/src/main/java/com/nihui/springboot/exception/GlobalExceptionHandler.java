package com.nihui.springboot.exception;

import com.nihui.springboot.response.ResponseData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;

/**
 * @Classname GlobalExceptionHandler
 * @Description TODO
 * @Date 2019/11/11 4:29 PM
 * @Created by nihui
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);


    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResponseData defalutErrorHandler(HttpServletRequest request, Exception e){
        logger.error("",e);
        ResponseData responseData = new ResponseData();
        responseData.setMessage(e.getMessage());
        if(e instanceof NoHandlerFoundException){
            responseData.setCode(404);
        }else{
            responseData.setCode(500);
        }
        responseData.setData(null);
        responseData.setStatus(false);
        return responseData;
    }
}
