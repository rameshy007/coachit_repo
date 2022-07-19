package com.coachit.rest_demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.coachit.rest_demo.entity.Course;
import com.coachit.rest_demo.repository.ICourseRepo;

public class ICourseServiceImpl implements ICourseService {
	@Autowired
	private ICourseRepo iCourseRepo;

	@Override
	public String saveCourse(Course course) {
		Course latestCourse = null;
		latestCourse = iCourseRepo.save(course);

		return latestCourse.getId() != 0 ? "Success Record Inserted" : "Record Insertion Failed";
	}

	@Override
	public List<Course> getAllCourses() {
		List<Course> allCourseDetails = null;
		allCourseDetails = iCourseRepo.findAll();
		return allCourseDetails;
	}

}
