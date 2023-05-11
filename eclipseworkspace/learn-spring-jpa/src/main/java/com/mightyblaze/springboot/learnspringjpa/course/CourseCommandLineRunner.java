package com.mightyblaze.springboot.learnspringjpa.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mightyblaze.springboot.learnspringjpa.course.Course;
import com.mightyblaze.springboot.learnspringjpa.course.jpa.CourseJpaRep;
import com.mightyblaze.springboot.learnspringjpa.course.springdatajpa.CourseSpringDataJpaRep;
@Component
public class CourseCommandLineRunner implements CommandLineRunner{
	//@Autowired
	//private CourseJpaRep rep;
	
	@Autowired
	private CourseSpringDataJpaRep rep;
	@Override
	public void run(String... args) throws Exception {
		rep.save(new Course(3,"Brogr","Mighty Blaze"));
		rep.save(new Course(8,"Rhodia","Mighty Blaze"));
		rep.save(new Course(1,"Xasmodius","Mighty Blaze"));
		rep.deleteById(8l);
		System.out.println(rep.findById(1l));
		System.out.println(rep.findById(3l));
		System.out.println(rep .count());
		System.out.println(rep.findByAuthor("Mighty Blaze"));
		System.out.println(rep.findByName("Brogr"));
		
	}
		

}
