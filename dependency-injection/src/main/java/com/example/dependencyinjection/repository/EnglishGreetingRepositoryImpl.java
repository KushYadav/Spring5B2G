package com.example.dependencyinjection.repository;

/**
 * Create by Kush on 31-03-2021
 */
public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {
    @Override
    public String getGreeting() {
        return "EN: Hello World !!! ";
    }
}
