package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.model.Employee;
import com.model.EmployeeDAO;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeDAO employeeDAO;
	@PostMapping("/addemployee")
	public String addemployee(@RequestBody Employee employee) {
		employeeDAO.save(employee);
		return "employee saved";
	}
	@PatchMapping("/updateemployee")
	public String updateemployee(@RequestBody Employee employee) {
		employeeDAO.save(employee);
		return "employee updated";
	}
	/*@DeleteMapping("/deleteemployee/{id}")
	public String deleteEmployee(@PathVariable int id) {
		employeeDAO.delete(id);
		return "Employee deleted";
		
	}*/
	/*@GetMapping("/getallemployees")
	public Iterable<Employee> findAll() {
		return employeeDAO.findAll();
	}*/
}
