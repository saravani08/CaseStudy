package com.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class EmployeeRating {

	@Id
	@GeneratedValue
	private int employeeRatingId;
	@OneToOne
	private Task task;
	@Enumerated(EnumType.STRING)
	private Rating rating;
	public EmployeeRating() {}
	public int getEmployeeRatingId() {
		return employeeRatingId;
	}
	public void setEmployeeRatingId(int employeeRatingId) {
		this.employeeRatingId = employeeRatingId;
	}
	public Task getTask() {
		return task;
	}
	public void setTask(Task task) {
		this.task = task;
	}
	public Rating getRating() {
		return rating;
	}
	public void setRating(Rating rating) {
		this.rating = rating;
	}
	
	
}