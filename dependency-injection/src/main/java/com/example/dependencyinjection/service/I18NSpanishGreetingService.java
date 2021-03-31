package com.example.dependencyinjection.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Create by Kush on 28-03-2021
 */
public class I18NSpanishGreetingService implements GreetingService {

    @Override
    public String greet() {
        return "ES: Hello World !!! ";
    }
}
