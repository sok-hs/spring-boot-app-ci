package com.project.sample_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcome() {
        System.out.println("Welcome to the Sample Spring Boot API!");
        return "Welcome to the Sample Spring Boot API!";
    }
}
