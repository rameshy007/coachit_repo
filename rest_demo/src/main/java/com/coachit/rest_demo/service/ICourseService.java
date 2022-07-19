package com.coachit.rest_demo.service;

import java.util.List;

import com.coachit.rest_demo.entity.Course;

public interface ICourseService {
public String saveCourse(Course course);
public List<Course> getAllCourses();
}
