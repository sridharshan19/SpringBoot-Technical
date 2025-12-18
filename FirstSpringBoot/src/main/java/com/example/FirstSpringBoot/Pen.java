package com.example.FirstSpringBoot;

import org.springframework.stereotype.Component;

@Component
public class Pen implements Writer {
    public void write() {
        System.out.println("Writing using Pen");
    }
}
