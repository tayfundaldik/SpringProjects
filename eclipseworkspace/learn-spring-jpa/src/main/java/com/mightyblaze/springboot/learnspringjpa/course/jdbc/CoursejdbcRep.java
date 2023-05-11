package com.mightyblaze.springboot.learnspringjpa.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mightyblaze.springboot.learnspringjpa.course.Course;

@Repository
public class CoursejdbcRep {
	@Autowired
	private JdbcTemplate springJdbcTemplate;
	private static String INSERT_QUERY = 
			""" 
					INSERT INTO course (id,name,author) VALUES (?,?,?);
			""";
	 private static String SELECT_QUERY =
			 """
	 		SELECT * FROM course WHERE id = ? 
             """;
	 
	public void insert(Course course) {
		springJdbcTemplate.update(INSERT_QUERY,course.getId(),course.getName(),course.getAuthor());
	}
	public Course findbyID(long id) {
		return springJdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class),id);
	}
}
