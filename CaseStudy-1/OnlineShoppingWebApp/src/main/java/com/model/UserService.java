package com.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	UserDAO userDAOImpl;
	public void saveUser(User user) {
		userDAOImpl.addUser(user);
	}
	public User findUser(String email) {
		return userDAOImpl.findUser(email);
	}
	public boolean deleteUser(String email) {
		return userDAOImpl.deleteUser(email);
	}
	public boolean updateUser(User user) {
		return userDAOImpl.updateUser(user);
	}
	public List<User> getAllUser(){
		return userDAOImpl.findAllUser();
	}
	
	
	

}
