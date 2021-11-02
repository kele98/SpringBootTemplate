package com.aikele.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
    @Pointcut("@annotation(MyAopAnnotation)")
    public void pt(){

    }
    @Before("pt()")
    public void before(){
        System.out.println("aop执行了");
    }
}
