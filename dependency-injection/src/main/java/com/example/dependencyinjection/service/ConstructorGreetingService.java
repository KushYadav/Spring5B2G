package com.example.dependencyinjection.service;

import org.springframework.stereotype.Service;

/**
 * Create by Kush on 28-03-2021
 */
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String greet() {
        return "Constructor: Hello World !!! ";
    }
}
