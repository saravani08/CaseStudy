package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Product;
import com.model.User;
import com.model.UserService;

@RestController
public class UserController {
	@Autowired
	UserService service;
	@PostMapping("/login")
	public String authenticateUser(@RequestBody User user) {
		
		User to_be_checked=service.findUser(user.getEmail());
		if(to_be_checked!=null) {
			if(to_be_checked.getPassword().equals(user.getPassword())) return "user authenticated";
			else return "invalid user 2";
		}
		else return "invalid user";
				
		
	}
	@PostMapping("/adduser")
	public String adduser(@RequestBody User user) {
		service.saveUser(user);
		return "user added successfully";
	}
	@PatchMapping("/updateuser")
	public String updateUser(@RequestBody User user)
	{
	if(service.updateUser(user))
	{
	return "user updated";
	}
	else
	{
	return "user not updated";
	}

	}

	@GetMapping("/finduser/{email}")
	public User getProduct(@PathVariable("email") String email)
	{
	return service.findUser(email);
	}

	@GetMapping("/findalluser")
	public List<User> getAllProduct()
	{
	return service.getAllUser();
	}
	@DeleteMapping("/deleteuser/{email}")
	public String deleteUser(@PathVariable("email") String email)
	{
	if(service.deleteUser(email))
	{
	return "user deleted ";
	}
	else
	{
	return "user not deleted";
	}
	}

	
	

}