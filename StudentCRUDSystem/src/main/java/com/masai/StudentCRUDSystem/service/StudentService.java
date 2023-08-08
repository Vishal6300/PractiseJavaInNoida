package com.masai.StudentCRUDSystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.masai.StudentCRUDSystem.model.Student;

@Service
public interface StudentService {
		
	public Student addStudent(Student student);
	public Optional<Student> searchStudentByStudentId(Integer id);
	public List<Student> listOfAllStudent();
	public Object updateStudentById(Integer id, Student student);
	public void deleteStudent(Integer id);
	
}
