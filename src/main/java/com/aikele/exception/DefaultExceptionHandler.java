package com.aikele.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class DefaultExceptionHandler{
    @ExceptionHandler(Exception.class)
    public String exception(Exception e){
        System.out.println("全局异常处理"+e);
        return "hello";
    }
}

