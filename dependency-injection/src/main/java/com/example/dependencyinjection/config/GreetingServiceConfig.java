package com.example.dependencyinjection.config;

import com.example.dependencyinjection.service.ConstructorGreetingService;
import com.example.dependencyinjection.service.PropertyGreetingService;
import com.example.dependencyinjection.service.SetterGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Create by Kush on 31-03-2021
 */
@Configuration
public class GreetingServiceConfig {

    @Bean
    ConstructorGreetingService constructorGreetingService(){
        return new ConstructorGreetingService();
    }

    @Bean
    PropertyGreetingService propertyGreetingService(){
        return new PropertyGreetingService();
    }

    @Bean
    SetterGreetingService setterGreetingService(){
        return new SetterGreetingService();
    }

}
