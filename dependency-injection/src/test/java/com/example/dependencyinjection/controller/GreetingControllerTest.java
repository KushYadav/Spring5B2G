package com.example.dependencyinjection.controller;

import com.example.dependencyinjection.service.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Create by Kush on 28-03-2021
 */
class GreetingControllerTest {

    PropertyInjectedController greetingController;

    @BeforeEach
    void setUp() {
        greetingController = new PropertyInjectedController();
        greetingController.greetingService = new ConstructorGreetingService();
    }

    @Test
    void getGreeting() {

        System.out.println(greetingController.getGreeting());

    }

}