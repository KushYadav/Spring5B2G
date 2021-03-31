package com.example.dependencyinjection.service;

import org.springframework.stereotype.Component;

/**
 * Create by Kush on 31-03-2021
 */
@Component
public class SingletonBean {

    public SingletonBean() {
        System.out.println("Creating a Singleton Bean");
    }

    public String getMyScope(){
        return "I'm a Singleton";
    }

}
