package com.masai.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.main.model.Teacher;
import com.masai.main.repository.TeacherRepository;

@Service
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	TeacherRepository teacherRepo;
	
	@Override
	public Teacher addTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return teacherRepo.save(teacher);
	}

	@Override
	public List<Teacher> viewAllTeacher() {
		// TODO Auto-generated method stub
		return teacherRepo.findAll();
	}

	@Override
	public Optional<Teacher> findTeacherById(Integer id) {
		// TODO Auto-generated method stub
		return teacherRepo.findById(id);
	}

	
	@Override
	public void deleteTeacherById(Integer id) {
		// TODO Auto-generated method stub
		teacherRepo.deleteById(id);

	}
	
	public Object updateTeacherData(Integer id, Teacher teacher){
		Optional<Teacher> checkTeacher= teacherRepo.findById(id);
		
		if(checkTeacher.isPresent()) {
			Teacher tteacher= checkTeacher.get();
			tteacher.setTeacherName(teacher.getTeacherName());
			tteacher.setSalary(teacher.getSalary());
			Teacher newteacher = teacherRepo.save(tteacher);
			
			return newteacher;
		}else {
			return "Invalid Teacher ID!";
		}
	}


}
