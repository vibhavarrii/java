package com.in40minutes.springboot.learn_spring_boot;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courses")
public class CourseController {
	
	@Autowired

    @RequestMapping
    public List<Course> getAllCourses() {

        return Arrays.asList(
                new Course(1, "Learn AWS", "in"),
                new Course(2, "Learn Cloud", "in")
        );
    }
    
    @GetMapping("/courses/1")
    public Course getCourseDetails() {
    	return new Course(1,"Learn","hii");
    }
}