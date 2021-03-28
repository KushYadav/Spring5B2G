package com.example.dependencyinjection;

import com.example.dependencyinjection.controller.*;
import com.example.dependencyinjection.service.PetService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(DependencyInjectionApplication.class, args);

        I18NController i18NController = applicationContext.getBean(I18NController.class);
        System.out.println("#### -> i18N");
        System.out.println(i18NController.greet());

        MyController myController = applicationContext.getBean(MyController.class);
        System.out.println("#### -> Primary");
        System.out.println(myController.greet());

        System.out.println("#### -> Property");
        PropertyInjectedController propertyController = applicationContext.getBean(PropertyInjectedController.class);
        System.out.println(propertyController.getGreeting());

        System.out.println("#### -> Setter");
        SetterInjectedController setterInjectedController = applicationContext.getBean(SetterInjectedController.class);
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("#### -> Constructor");
        ConstructorInjectedController constructorInjectedController = applicationContext.getBean(ConstructorInjectedController.class);
        System.out.println(constructorInjectedController.getGreeting());

        PetController petController = applicationContext.getBean(PetController.class);
        System.out.print(String.format("%s are the best pets.",petController.whichPetIsTheBest()));

    }

}
