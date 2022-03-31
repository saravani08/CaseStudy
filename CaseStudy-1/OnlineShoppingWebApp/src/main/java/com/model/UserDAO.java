package com.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public interface UserDAO {
	public void addUser(User user);
	public User findUser(String email);
	public List<User> findAllUser();
	public boolean updateUser(User user);
	public boolean deleteUser(String email);
}