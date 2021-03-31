package com.example.dependencyinjection.service;

/**
 * Create by Kush on 28-03-2021
 */
public class I18NEnglishGreetingService implements GreetingService {
    @Override
    public String greet() {
        return "EN: Hello World !!! ";
    }
}
