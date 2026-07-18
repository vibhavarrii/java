package com.example.learn_spring_framework.examples.c1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
@Component
class ClassA{
	
}
@Component
@Lazy//bean is to lazily initialized
//default initialization:Eager(recommended->errors are easily discovered)
class ClassB{
	private ClassA classA;

	public ClassB(ClassA classA) {
		System.out.println("Some initialization ");
		this.classA = classA;
	}
	public void doSomething() {
		System.out.println("do something");
	}
}
@Configuration
@ComponentScan
public class RealWorldSpringContextLauncher {

    public static void main(String[] args) {

        try (var context =
                new AnnotationConfigApplicationContext(RealWorldSpringContextLauncher.class)) {
        	Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);;
        	System.out.println("Initialization of context is empty");
        	context.getBean(ClassB.class).doSomething();
        }
    }
}