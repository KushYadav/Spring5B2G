package com.example.dependencyinjection.config;

import com.example.dependencyinjection.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

/**
 * Create by Kush on 31-03-2021
 */
@Configuration
public class GreetingServiceConfig {

    @Profile("ES")
    @Bean("i18NService")
    I18NSpanishGreetingService i18NSpanishGreetingService(){
        return new I18NSpanishGreetingService();
    }

    @Profile({"EN", "default"})
    @Bean
    I18NEnglishGreetingService i18NService(){
        return new I18NEnglishGreetingService();
    }

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService(){
        return new PrimaryGreetingService();
    }

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
