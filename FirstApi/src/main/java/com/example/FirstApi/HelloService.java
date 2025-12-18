package com.example.FirstApi;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String wish() {
        return "✨ Greetings! Hope you're having a great day! ✨";
    }

    public String Hell() {
        return "🚀 Welcome to learning Spring Boot! Keep coding and keep growing! 💡";
    }

}

