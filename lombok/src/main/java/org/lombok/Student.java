package org.lombok;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
public class Student {
    private int roll;
    @Autowired
    private Writer w;



    public void write() {
        w.exam();
    }
}
