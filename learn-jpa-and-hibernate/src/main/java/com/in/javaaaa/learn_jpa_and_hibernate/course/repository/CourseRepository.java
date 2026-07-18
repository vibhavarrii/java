package com.in.javaaaa.learn_jpa_and_hibernate.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in.javaaaa.learn_jpa_and_hibernate.course.Course;

public interface CourseRepository extends JpaRepository<Course,Long> {
	

}
