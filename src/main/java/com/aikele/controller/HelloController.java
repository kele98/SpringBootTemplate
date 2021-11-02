package com.aikele.controller;


import com.aikele.aop.MyAopAnnotation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Transactional
@RestController
public class HelloController {
    @RequestMapping("/hello")
    @MyAopAnnotation
    public String hello(){
        return "hello";
    }
}
