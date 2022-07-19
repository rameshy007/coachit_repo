package com.coachit.rest_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coachit.rest_demo.entity.Course;

public interface ICourseRepo extends JpaRepository<Course, Long> {

}
