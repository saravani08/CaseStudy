package com.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Attendance {
	@Id
	@GeneratedValue
	private int attendanceId;
	@JsonFormat(pattern="dd-MM-yyyy")
	private Date attendanceDate;
	@Enumerated(EnumType.STRING)
	private AttendanceType status;
	public Attendance() {}
	public int getAttendanceId() {
		return attendanceId;
	}
	public void setAttendanceId(int attendanceId) {
		this.attendanceId = attendanceId;
	}
	public Date getAttendanceDate() {
		return attendanceDate;
	}
	public void setAttendanceDate(Date attendanceDate) {
		this.attendanceDate = attendanceDate;
	}
	public AttendanceType getStatus() {
		return status;
	}
	public void setStatus(AttendanceType status) {
		this.status = status;
	}
	
}