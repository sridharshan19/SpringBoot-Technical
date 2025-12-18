package com.example.FirstSpringBoot;


import jdk.jfr.DataAmount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class Student {

    @Autowired
    private Writer w;

    public void write() {
        w.write();
    }
}
