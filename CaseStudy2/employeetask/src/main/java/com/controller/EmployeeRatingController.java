package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.EmployeeRating;
import com.model.EmployeeRatingDAO;

@RestController
public class EmployeeRatingController {
	@Autowired
	EmployeeRatingDAO employeeratingDAO;
	@PostMapping("/addemployeerating")
	public String addEmployeeRating(@RequestBody EmployeeRating employeerating) {
		employeeratingDAO.save(employeerating);
		return "employee rating added";
	}

}
