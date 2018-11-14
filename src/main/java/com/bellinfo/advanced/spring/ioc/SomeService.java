package com.bellinfo.advanced.spring.ioc;

public class SomeService {
    private static SomeService someService = new SomeService();

    private SomeService(){

    }

    public static SomeService getInstance(){
        return someService;
    }

}
