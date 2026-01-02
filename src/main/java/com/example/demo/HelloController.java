package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Greetings from AWS EKS! Your Java App is Running.";
    }

    @GetMapping("/health")
    public String health() {
        return "UP";
    }
}
