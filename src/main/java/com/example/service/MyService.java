package com.example.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author : KaelvihN
 * @date : 2023/8/20 19:37
 */

@Service

public class MyService {
    private static final Logger log = LoggerFactory.getLogger(MyService.class);
    public static void foo(){
        log.info("foo...");
    }
}
