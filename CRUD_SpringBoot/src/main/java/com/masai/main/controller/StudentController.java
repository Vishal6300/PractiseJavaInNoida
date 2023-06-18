 package com.masai.main.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.main.model.Student;
import com.masai.main.service.StudentService;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping("/addStudent")
	public Student addStudent (@RequestBody Student student){
		return studentService.addStudent(student);
	}
	
	@GetMapping("/viewStudent")
	public List<Student> viewStudent() {
		return studentService.viewStudentList();
	}
	
	@GetMapping("/studentGetById/{id}")
	public Optional<Student> searchStudentById(@PathVariable Integer id) {
		return studentService.searchStudentByRollNo(id);
	}
	
	@GetMapping("/studentGetByRollNo/{rollNo}")
	public Optional<Student> searchStudentByRollNo(@PathVariable Integer rollNo){
		return studentService.searchStudentByRollNo(rollNo);
	}
	
	@Transactional
	@DeleteMapping("/studentDeleteByRoll/{rollNo}")
	public void deleteStudent(@PathVariable Integer rollNo) {
		 studentService.deleteStudent(rollNo);
	}
	
	@PutMapping("/updateStudentDetails/{id}")
	public Object updateStudentDetails(@PathVariable Integer id,@RequestBody Student student) {
		return studentService.updateStudentData(id, student);
		
	}
}
