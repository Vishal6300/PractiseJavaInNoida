package com.masai.main.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer studentId;
	private Integer rollNo;
	private String name;
	private String city;
	private Integer marks;
	
	
	public Integer getStudentId() {
		return studentId;
	}

	public Integer getRollNo() {
		return rollNo;
	}


	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public Integer getMarks() {
		return marks;
	}


	public void setMarks(Integer marks) {
		this.marks = marks;
	}


	public Student(Integer rollNo, String name, String city, Integer marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
