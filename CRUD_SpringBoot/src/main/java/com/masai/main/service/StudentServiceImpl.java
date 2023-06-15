package com.masai.main.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.masai.main.model.Student;
import com.masai.main.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	

	@Autowired
	private StudentRepository studentRepo;
	
	
	@Override
	public Student addStudent(Student student) {
			return studentRepo.save(student);
		
	}

	@Override
	public Optional<Student> searchStudentById(Integer id) {
		// TODO Auto-generated method stub
		

	    return studentRepo.findById(id);	
	   }
	
	@Override
	public Optional<Student> searchStudentByRollNo(Integer rollNo) {
		// TODO Auto-generated method stub
		

	    return studentRepo.findByRollNo(rollNo);	
	   }

	@Override
	public List<Student> viewStudentList() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
		
	}

	@Override
	public Student updateStudentData(Integer studentId) {
		// TODO Auto-generated method stub
		return studentRepo.getById(studentId) ;
		
	}

	@Override
	public void deleteStudent(Integer rollNo) {
		// TODO Auto-generated method stub
		studentRepo.deleteByRollNo(rollNo);;
		
	}

}
