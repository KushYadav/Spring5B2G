package com.example.dependencyinjection.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Create by Kush on 28-03-2021
 */

@Primary
@Service
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String greet() {
        return "Primary: Hello World !!! ";
    }
}
