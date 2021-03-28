package com.example.dependencyinjection.controller;

import com.example.dependencyinjection.service.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Create by Kush on 28-03-2021
 */

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String greet() {
        return greetingService.greet();
    }


}
