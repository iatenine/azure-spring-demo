package com.revature.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello from Spring Boot App!";
    }

    @GetMapping("/fruit")
    public String fruit() {
        return "apple banana kiwi orange lemon";
    }
}
