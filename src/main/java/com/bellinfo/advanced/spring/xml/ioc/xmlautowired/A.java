package com.bellinfo.advanced.spring.xml.ioc.xmlautowired;

public class A {

    B bobj;

    public void setBobj(B bobj) {
        this.bobj = bobj;
    }

    @Override
    public String toString() {
        return "A{" +
                "bobj=" + bobj +
                '}';
    }
}
