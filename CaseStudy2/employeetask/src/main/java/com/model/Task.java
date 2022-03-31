package com.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Task {

	@Id
	@GeneratedValue
	private int taskId;
	private String taskname;
	private String taskDescription;
	@JsonFormat(pattern="dd-MM-yyyy")
	private Date dateOfAllocation;
	@JsonFormat(pattern="dd-MM-yyyy")
	private Date deadLine;
	@OneToOne
	private Employee allocatedTo;
	public Task() {}
	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	public String getTaskname() {
		return taskname;
	}
	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}
	public String getTaskDescription() {
		return taskDescription;
	}
	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}
	public Date getDateOfAllocation() {
		return dateOfAllocation;
	}
	public void setDateOfAllocation(Date dateOfAllocation) {
		this.dateOfAllocation = dateOfAllocation;
	}
	public Date getDeadLine() {
		return deadLine;
	}
	public void setDeadLine(Date deadLine) {
		this.deadLine = deadLine;
	}
	public Employee getAllocatedTo() {
		return allocatedTo;
	}
	public void setAllocatedTo(Employee allocatedTo) {
		this.allocatedTo = allocatedTo;
	}
	
}