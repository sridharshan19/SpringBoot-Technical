package org.lombok;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Pencil implements Writer {

    public void exam() {
        System.out.println("Pen is used in the exam....");

    }
}
