package com.masai.StudentCRUDSystem.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.StudentCRUDSystem.model.Student;
import com.masai.StudentCRUDSystem.service.StudentService;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/stud")
@CrossOrigin(maxAge = 32000)
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}

	
	@GetMapping("/viewAllStudent")
	public List<Student> viewStudentList() {
		return studentService.listOfAllStudent();
	}
	
	@GetMapping("/getStudentById/{id}")
	public Optional<Student> getStudentById(@PathVariable Integer id) {
		return studentService.searchStudentByStudentId(id);
	}
	
	@PutMapping("/updateStudent/{id}")
	public Object updateStudent(@PathVariable Integer id,@RequestBody Student student){
		return studentService.updateStudentById(id, student);
	}
	
	@Transactional
	@GetMapping("/deleteById/{id}")
	public void deleteStudentById(@PathVariable Integer id) {
		 studentService.deleteStudent(id);
	}
}
