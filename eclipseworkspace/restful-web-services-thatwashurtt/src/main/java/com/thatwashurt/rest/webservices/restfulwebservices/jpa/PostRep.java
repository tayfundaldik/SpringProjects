package com.thatwashurt.rest.webservices.restfulwebservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thatwashurt.rest.webservices.restfulwebservices.user.Post;


public interface PostRep extends JpaRepository<Post, Integer>{
	
}
