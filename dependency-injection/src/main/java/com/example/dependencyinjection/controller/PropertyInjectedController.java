package com.example.dependencyinjection.controller;

import com.example.dependencyinjection.service.GreetingService;
import com.example.dependencyinjection.service.PropertyGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Create by Kush on 28-03-2021
 */

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyGreetingService")
    @Autowired
    GreetingService greetingService;

    public String getGreeting() {
        return greetingService.greet();
    }

}
