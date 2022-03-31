package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Attendance;
import com.model.AttendanceDAO;
@RestController
public class AttendanceController {
	@Autowired
	AttendanceDAO attendanceDAO;
	@PostMapping("/addattendance")
	public String addAttendance(@RequestBody Attendance attendance) {
		attendanceDAO.save(attendance);
		return "attendance added";
	}

}