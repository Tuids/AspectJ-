package com.example.jac;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author : KaelvihN
 * @date : 2023/8/20 19:37
 */

@Aspect
@Component

public class MyAspect {
    private static final Logger log = LoggerFactory.getLogger(MyAspect.class);


    @Before("execution(* com.example.service.MyService.foo())")
    public void before() {
        log.info("before...");
    }
}
