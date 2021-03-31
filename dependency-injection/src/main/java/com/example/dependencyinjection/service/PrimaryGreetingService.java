package com.example.dependencyinjection.service;

/**
 * Create by Kush on 28-03-2021
 */
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String greet() {
        return "Primary: Hello World !!! ";
    }
}
