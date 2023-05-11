package com.mightyblaze.springboot.learnspringjpa.course.springdatajpa;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mightyblaze.springboot.learnspringjpa.course.Course;

public interface CourseSpringDataJpaRep extends JpaRepository<Course, Long>{
		List<Course> findByAuthor(String author);
		List<Course> findByName(String name);
}
