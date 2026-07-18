package com.in.javaaaa.learn_jpa_and_hibernate.course.springJpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in.javaaaa.learn_jpa_and_hibernate.course.Course;

public interface CourseSpringJpaREpository extends JpaRepository<Course,Long> {
	List<Course>findByAuthor(String author);
	List<Course>findByName(String name);
}
