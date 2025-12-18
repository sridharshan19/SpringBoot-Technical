package com.example.First_Spring_Security.Controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String home(HttpServletRequest request) {
        return "Welcome to the Spring Boot Home Page  " + request.getSession().getId();
    }

    @GetMapping("/about")
    public String about() {
        return "This application is built using Spring Boot";
    }


}
