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
	public Object updateStudentData(Integer studentId, Student student) {
		
		Optional<Student> stud= studentRepo.findById(studentId);
		
		if(stud.isPresent()) {
			Student student1= stud.get();
			student1.setRollNo(student.getRollNo());
			student1.setName(student.getName());
			student1.setCity(student.getCity());
			student1.setMarks(student.getMarks());
			
			Student stt=studentRepo.save(student1);
			return stt;
			
		}else {
			return "StudentId didn't match";
		}
		
	}

	@Override
	public void deleteStudent(Integer rollNo) {
		// TODO Auto-generated method stub
		studentRepo.deleteByRollNo(rollNo);;
		
	}

}
