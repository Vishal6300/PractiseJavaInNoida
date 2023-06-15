package com.masai.dao;

import com.masai.model.Student;

public interface StudentDao {
		public void addStudent(Student student);
		public void searchStudentByRollNo(int rollNo);
		public void viewStudentList();
		public void updateStudentData(int studentId);
		public void deleteStudent(int rollNo);
}
