package com.masai.main.model;

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
		private Integer salary;
		
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
		public Integer getSalary() {
			return salary;
		}
		public void setSalary(Integer salary) {
			this.salary = salary;
		}
		public Teacher(Integer teacherId, String teacherName, Integer salary) {
			super();
			this.teacherId = teacherId;
			this.teacherName = teacherName;
			this.salary = salary;
		}
		public Teacher() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Teacher [teacherId=" + teacherId + ", teacherName=" + teacherName + ", salary=" + salary + "]";
		}
		
		
		}
