package com.teacher.CRUDOnTeacher.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Teacher {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer teacherId;
	private String teacherName;
	private String collegeName;
	private Integer Salary;
	public Integer getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public Integer getSalary() {
		return Salary;
	}
	public void setSalary(Integer salary) {
		Salary = salary;
	}
	public Teacher(Integer teacherId, String teacherName, String collegeName, Integer salary) {
		super();
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.collegeName = collegeName;
		Salary = salary;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
