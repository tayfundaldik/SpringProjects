package com.thatwashurt.rest.webservices.restfulwebservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import com.thatwashurt.rest.webservices.restfulwebservices.user.User;

public interface UserRep extends JpaRepository<User, Integer>{
	
}
