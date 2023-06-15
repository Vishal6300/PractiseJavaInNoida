package com.masai.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.masai.main.model.Student;

@Service
public interface StudentService {
		public Student addStudent(Student student);
		public Optional<Student> searchStudentByRollNo(Integer rollNo);
		public Optional<Student> searchStudentById(Integer id);
		public List<Student> viewStudentList();
		public Student updateStudentData(Integer studentId);
		public void deleteStudent(Integer rollNo);
}
