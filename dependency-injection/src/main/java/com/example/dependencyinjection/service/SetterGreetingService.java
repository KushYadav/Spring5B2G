package com.example.dependencyinjection.service;

import org.springframework.stereotype.Service;

/**
 * Create by Kush on 28-03-2021
 */

@Service
public class SetterGreetingService implements GreetingService {
    @Override
    public String greet() {
        return "Setter: Hello World !!! ";
    }
}