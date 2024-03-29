package com.masai.StudentCRUDSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Integer StudentId;
		private String name;
		private Integer rollNo;
		private String collegeName;
		
		
		public Integer getStudentId() {
			return StudentId;
		}
		
		
		
		public void setStudentId(Integer studentId) {
			StudentId = studentId;
		}



		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Integer getRollNo() {
			return rollNo;
		}
		public void setRollNo(Integer rollNo) {
			this.rollNo = rollNo;
		}
		public String getCollegeName() {
			return collegeName;
		}
		public void setCollegeName(String collegeName) {
			this.collegeName = collegeName;
		}
		
		@Override
		public String toString() {
			return "Student [name=" + name + ", rollNo=" + rollNo + ", collegeName="
					+ collegeName + "]";
		}
		
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public Student(String name, Integer rollNo, String collegeName) {
			super();
			this.name = name;
			this.rollNo = rollNo;
			this.collegeName = collegeName;
		}
		
		
		
}
