package com.bellinfo.advanced.spring.annotation.ioc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Repository
public class Transactions {

    int tanid = 20;

    @Override
    public String toString() {
        return "Transactions{" +
                "tanid=" + tanid +
                '}';
    }
}
