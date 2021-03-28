package com.example.dependencyinjection.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Create by Kush on 28-03-2021
 */

@Profile({"EN", "default"})

@Service("i18NService")
public class I18NEnglishGreetingService implements GreetingService {
    @Override
    public String greet() {
        return "EN: Hello World !!! ";
    }
}
