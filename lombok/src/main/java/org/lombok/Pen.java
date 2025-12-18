package org.lombok;

import org.springframework.stereotype.Component;

@Component
public class Pen implements Writer {

    public void exam() {
        System.out.println("Pen is used in the exam....");
    }
}
