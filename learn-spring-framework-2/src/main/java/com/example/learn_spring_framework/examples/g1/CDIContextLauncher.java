package com.example.learn_spring_framework.examples.g1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component//@Named
class BusinessService{
	DataService dataService;
	
	public DataService getDataService() {
		return dataService;
	}
	@Autowired//@Inject
	public void setDataService(DataService dataService) {
		System.out.println("setter injection");
		this.dataService = dataService;
	}
	
}
@Component
class DataService{
	
}
@Configuration
@ComponentScan
public class CDIContextLauncher {

    public static void main(String[] args) {

        try (var context =
                new AnnotationConfigApplicationContext(CDIContextLauncher.class)) {
        	Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);;
        	
        	System.out.println(context.getBean(BusinessService.class).getDataService());
        }
    }
}