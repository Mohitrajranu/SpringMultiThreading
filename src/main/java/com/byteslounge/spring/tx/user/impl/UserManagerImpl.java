package main.java.com.byteslounge.spring.tx.user.impl;

import java.util.List;

import main.java.com.byteslounge.spring.tx.dao.UserDAO;
import main.java.com.byteslounge.spring.tx.model.User;
import main.java.com.byteslounge.spring.tx.user.UserManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;



@Component
public class UserManagerImpl implements UserManager {

	@Autowired
	private UserDAO userDAO;
	
	@Override
	@Transactional
	public void insertUser(User user) {
		userDAO.insertUser(user);
	}

	@Override
	@Transactional
	public User getUserById(int userId) {
		return userDAO.getUserById(userId);
	}
	
	@Override
	@Transactional
	public User getUser(String username) {
		return userDAO.getUser(username);
	}

	@Override
	@Transactional
	public List<User> getUsers() {
		return userDAO.getUsers();
	}



}
