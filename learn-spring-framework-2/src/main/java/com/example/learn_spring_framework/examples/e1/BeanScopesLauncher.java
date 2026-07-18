package com.example.learn_spring_framework.examples.e1;

import java.util.Arrays;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component//same hashcode without scope
class NormalClass{
	
}

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)//different hashcode with scope
class PrototypeClass{
	
}
@Configuration
@ComponentScan
public class BeanScopesLauncher {

    public static void main(String[] args) {

        try (var context =
                new AnnotationConfigApplicationContext(BeanScopesLauncher.class)) {
        	System.out.println(context.getBean(NormalClass.class));
        	System.out.println(context.getBean(NormalClass.class));
        	System.out.println(context.getBean(PrototypeClass.class));
        	System.out.println(context.getBean(PrototypeClass.class));
        	System.out.println(context.getBean(PrototypeClass.class));
        }
    }
}