package com.coachit.rest_demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coachit.rest_demo.entity.Course;
import com.coachit.rest_demo.service.ICourseService;

@RestController
@RequestMapping(path = "/myapp")
public class MyController {

	@Autowired
	private ICourseService iCourseService;

	@PostMapping(path = "/courseSave")
	public String saveCourseData(@RequestBody Course course) {
		String response = iCourseService.saveCourse(course);
		return response;
	}
	
	@GetMapping(path = "/getCourses")
	public List<Course> getAllCoursesData() {
		return iCourseService.getAllCourses();
		
	}

}
