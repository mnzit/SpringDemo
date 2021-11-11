package com.sudreeshya.demo;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@Slf4j
public class Main {

    public static void main(String[] args) {
        log.debug("This is debug");
        log.info("This is info");
        log.error("This is error");
        log.trace("This is trace");


        // TRACE
        // DEBUG
        // INFO
        // ERROR

        // IOC Container
//        ApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
//        System.out.println(xmlApplicationContext);
//        System.out.println(xmlApplicationContext.getBean("person").toString());
//        System.out.println(xmlApplicationContext.getBeanDefinitionCount());
        // IOC Container
        ApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext("com.sudreeshya.demo");

    }
}
