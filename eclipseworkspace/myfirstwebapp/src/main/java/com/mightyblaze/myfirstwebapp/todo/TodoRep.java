package com.mightyblaze.myfirstwebapp.todo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRep extends JpaRepository<Todo, Integer> {
	public List<Todo> findByUsername(String username);
}
