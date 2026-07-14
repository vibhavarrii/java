package com.example.learn_spring_framework.examples.d1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class LazyInitializationLauncher {

    public static void main(String[] args) {

        try (var context =
                new AnnotationConfigApplicationContext(LazyInitializationLauncher.class)) {
        	Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);;
        }
    }
}