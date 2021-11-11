package com.sudreeshya.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component // Singleton Bean
@Slf4j
public class TestService3 {
    public TestService3(){
        log.debug("TestService3 is constructed");
    }
}
