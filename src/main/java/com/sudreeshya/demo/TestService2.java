package com.sudreeshya.demo;

public class TestService2 {

    public TestService testService;

    public TestService2(){
        System.out.println("TestService2 is constructed");
    }

    public void setTestService(TestService testService) {
        System.out.println("Setter has been invoked");
        this.testService = testService;
    }
}
