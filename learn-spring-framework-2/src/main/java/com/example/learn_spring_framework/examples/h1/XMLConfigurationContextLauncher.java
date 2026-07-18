package com.example.learn_spring_framework.examples.h1;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class XMLConfigurationContextLauncher {

    public static void main(String[] args) {

        try (var context =
                new ClassPathXmlApplicationContext("contextConfig.xml") ){
        	Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        	
        	System.out.println(context.getBean("name"));

   
    }
}
}
