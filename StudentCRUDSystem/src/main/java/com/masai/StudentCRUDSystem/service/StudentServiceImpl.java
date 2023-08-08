package com.masai.StudentCRUDSystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.StudentCRUDSystem.model.Student;
import com.masai.StudentCRUDSystem.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentRepo studentRepo;

	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		
		return studentRepo.save(student);
	}

	@Override
	public Optional<Student> searchStudentByStudentId(Integer id) {
		// TODO Auto-generated method stub
		return studentRepo.findById(id);
	}

	@Override
	public List<Student> listOfAllStudent() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}

	@Override
	public Object updateStudentById(Integer id, Student student) {
		// TODO Auto-generated method stub
		Optional<Student> stud= studentRepo.findById(id);
		
		if(stud.isPresent()) {
			Student stu1= stud.get();
			stu1.setName(student.getName());
			stu1.setRollNo(student.getRollNo());
			stu1.setCollegeName(student.getCollegeName());
			
			Student stt= studentRepo.save(stu1);
			return stt;
		}else {
			return null;
		}
	}

	@Override
	public void deleteStudent(Integer id) {
		// TODO Auto-generated method stub
		studentRepo.deleteById(id);
	}

}
