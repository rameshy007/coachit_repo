package com.coachit.rest_demo.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.coachit.rest_demo.entity.Course;
import com.coachit.rest_demo.service.ICourseServiceImpl;
import com.coachit.rest_demo.service.ICourseService;

@Configuration
public class CourseConfigurations {
	@Bean
	public ICourseService getCourse() {
		return new ICourseServiceImpl();
	}
}
