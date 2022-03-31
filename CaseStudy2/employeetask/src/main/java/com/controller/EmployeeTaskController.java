package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Employee;
import com.model.EmployeeDAO;

@RestController
public class EmployeeTaskController {
	@Autowired
	EmployeeDAO employeeDAO;
	
	@GetMapping("/getallemployees")
	public Iterable<Employee> getAllEmployees(){
		return employeeDAO.findAll();
	}
	@GetMapping("/")
	public String getString() {
		return "Hello world";
	}
	
	
}
