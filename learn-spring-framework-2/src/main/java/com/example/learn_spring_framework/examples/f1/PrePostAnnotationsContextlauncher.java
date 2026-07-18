package com.example.learn_spring_framework.examples.f1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


@Component
class SomeClass{
	private SomeDependency someDependency;
	public SomeClass(SomeDependency someDependency) {
		super();
		this.someDependency = someDependency;
		System.out.println("All dependencies are ready");
	}
	@PostConstruct
	public void initialization() {
		someDependency.getReady();
		
	}
	
	@PreDestroy//used to release the resources its holding
	public void CleanUp() {
		System.out.println("cleanUp");
	}
	
}


@Component
class SomeDependency{

	public void getReady() {
		// TODO Auto-generated method stub
		System.out.println("some logic using some dependency");
		
	}
	
}

@Configuration
@ComponentScan
public class PrePostAnnotationsContextlauncher {

    public static void main(String[] args) {

        try (var context =
                new AnnotationConfigApplicationContext(PrePostAnnotationsContextlauncher.class)) {
        	Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);;
        }
    }
}