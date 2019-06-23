package main.java.com.byteslounge.spring.tx.dao;

import java.util.List;

import main.java.com.byteslounge.spring.tx.model.User;



public interface UserDAO {

	void insertUser(User user);
	
	User getUserById(int userId);
	
	User getUser(String username);
	
	List<User> getUsers();
}
