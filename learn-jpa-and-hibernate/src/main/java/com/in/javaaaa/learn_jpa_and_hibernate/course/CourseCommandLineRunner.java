package com.in.javaaaa.learn_jpa_and_hibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in.javaaaa.learn_jpa_and_hibernate.course.Course;
import com.in.javaaaa.learn_jpa_and_hibernate.course.jdbc.CoursejdbcRepository;
import com.in.javaaaa.learn_jpa_and_hibernate.course.springJpa.CourseSpringJpaREpository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//	@Autowired
//	private CoursejdbcRepository repository;
	
//	public CourseCommandLineRunner(CoursejdbcRepository repository) {
//        this.repository = repository;
//    }
	
	@Autowired
	private CourseSpringJpaREpository repository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		repository.insert(new Course(1,"Joe","suzy"));
//		repository.insert(new Course(2,"Jo","suzy"));
//		repository.insert(new Course(3,"J","suzy"));
//		repository.DeleteById(1);
		repository.save(new Course(1,"Joe","suzy"));
		repository.save(new Course(2,"Jo","suzy"));
		repository.save(new Course(3,"J","suzy"));
		
		repository.deleteById(1l);
		
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		
		System.out.println(repository.findByAuthor("suzy"));
		System.out.println(repository.findByAuthor(""));
		
		System.out.println(repository.findByName("Jo"));
		System.out.println(repository.findByAuthor("J"));
		
	}

}
