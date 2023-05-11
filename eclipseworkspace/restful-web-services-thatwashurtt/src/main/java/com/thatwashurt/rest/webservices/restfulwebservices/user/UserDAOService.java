package com.thatwashurt.rest.webservices.restfulwebservices.user;

import java.util.List;
import java.util.function.Predicate;
import java.time.LocalDate;
import java.util.ArrayList;
import org.springframework.stereotype.Component;

@Component
public class UserDAOService {
	private static List<User> users = new ArrayList<>();
	private static Integer usersCount=0;
	static {
		users.add(new User(++usersCount,"Adam",LocalDate.now().minusYears(30)));
		users.add(new User(++usersCount,"Abby",LocalDate.now().minusYears(21)));
		users.add(new User(++usersCount,"Guts",LocalDate.now().minusYears(20)));
	}
	public List<User> findAll(){
		return users;
	}
	public User save(User user){
		user.setId(++usersCount);
		users.add(user);
		return user;
	}
	public User findOne(int id) {
		Predicate<? super User> predicate =users -> users.getId().equals(id);
		return users.stream().filter(predicate).findFirst().orElse(null);
	}
	public void deleteById(int id) {
		Predicate<? super User> predicate =users -> users.getId().equals(id);
		users.removeIf(predicate);
		
	}
}
