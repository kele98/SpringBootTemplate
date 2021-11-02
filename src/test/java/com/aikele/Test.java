package com.aikele;

import com.aikele.controller.HelloController;
import com.aikele.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Test {
    @Autowired
    HelloController helloController;
    @Autowired
    UserMapper userMapper;
    @org.junit.jupiter.api.Test
    public void test(){
        System.out.println(userMapper.getAll());
    }
}
