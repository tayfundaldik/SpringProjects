package com.mightyblaze.springboot.learnspringjpa.course.jpa;

import org.springframework.stereotype.Repository;

import com.mightyblaze.springboot.learnspringjpa.course.Course;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRep {
	@PersistenceContext
	private EntityManager entityManager;
	
	public void insert(Course course) {
		entityManager.merge(course);
		
	}
	public Course findbyID(long id) {
		return entityManager.find(Course.class,id);
	}
	public void deletebyID(long id) {
		Course course = entityManager.find(Course.class,id);
		entityManager.remove(course);
	}
}
