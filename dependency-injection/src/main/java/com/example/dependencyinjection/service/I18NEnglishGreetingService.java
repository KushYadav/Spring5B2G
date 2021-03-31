package com.example.dependencyinjection.service;

import com.example.dependencyinjection.repository.EnglishGreetingRepository;

/**
 * Create by Kush on 28-03-2021
 */
public class I18NEnglishGreetingService implements GreetingService {

    private final EnglishGreetingRepository englishGreetingRepository;

    public I18NEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String greet() {
        return "EN: Hello World !!! ";
    }
}
