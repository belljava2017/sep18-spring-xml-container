package com.bellinfo.advanced.spring.annotation.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class Account {

    @Autowired
    Transactions transactions;

    @Override
    public String toString() {
        return "Account{" +
                "transactions=" + transactions +
                '}';
    }
}
