package com.example.dependencyinjection.controller;

import com.example.dependencyinjection.service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Create by Kush on 28-03-2021
 */

@Controller
public class I18NController {

    private final GreetingService greetingService;

    public I18NController(@Qualifier("i18NService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String greet() {
        return greetingService.greet();
    }


}
