package com.example.FirstApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    @Autowired
    HelloService h;
    @GetMapping("/")
    public String greet(){
        return h.wish();
    }

    @GetMapping("/about")
    public String Message(){
        return h.Hell();
    }
}
