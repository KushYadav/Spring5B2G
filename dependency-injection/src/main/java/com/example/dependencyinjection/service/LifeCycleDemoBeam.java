package com.example.dependencyinjection.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Create by Kush on 28-03-2021
 */

@Component
public class LifeCycleDemoBeam implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBeam() {
        System.out.println("I am in the LifeCycleBean Constructor");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("The bean factory has been set.");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean name is: " + s);
    }

    @Override
    public void destroy() throws Exception {

        System.out.println("The Lifecycle has been terminated.");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("The lifecycle bean has its properties set.");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application context has been set.");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("The PostConstruct annotated method has been called.");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("The PreDestroy annotated method has been called.");
    }

    public void beforeInit() {
        System.out.println("Before Init: Called by Bean post processor.");
    }

    public void afterInit() {
        System.out.println("After Init: Called by Bean Post processor");
    }
}
