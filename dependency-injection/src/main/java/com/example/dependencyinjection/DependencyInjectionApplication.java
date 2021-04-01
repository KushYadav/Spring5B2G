package com.example.dependencyinjection;

import com.example.dependencyinjection.controller.*;
import com.example.dependencyinjection.datasource.FakeDataSource;
import com.example.dependencyinjection.service.PrototypeBean;
import com.example.dependencyinjection.service.SingletonBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.security.Signature;

@ComponentScan(basePackages = {"com.example.dependencyinjection","com.example.petsdi"})
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

        SingletonBean singletonBean1 = applicationContext.getBean(SingletonBean.class);
        System.out.println(singletonBean1.getMyScope());
        SingletonBean singletonBean2 = applicationContext.getBean(SingletonBean.class);
        System.out.println(singletonBean1.getMyScope());

        PrototypeBean prototypeBean1 = applicationContext.getBean(PrototypeBean.class);
        System.out.println(prototypeBean1.getMyScope());
        PrototypeBean prototypeBean2 = applicationContext.getBean(PrototypeBean.class);
        System.out.println(prototypeBean2.getMyScope());

        FakeDataSource fakeDataSource = applicationContext.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource.getUsername());
        System.out.println(fakeDataSource.getPassword());
        System.out.println(fakeDataSource.getJdbcurl());


    }

}
