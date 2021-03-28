package com.example.dependencyinjection.controller;

import com.example.dependencyinjection.service.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Create by Kush on 28-03-2021
 */
class SetterInjectedControllerTest {

    SetterInjectedController setterInjectedController;

    @BeforeEach
    void setUp() {
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(new ConstructorGreetingService());
    }

    @Test
    void setGreetingService() {
        System.out.println(setterInjectedController.getGreeting());
    }
}