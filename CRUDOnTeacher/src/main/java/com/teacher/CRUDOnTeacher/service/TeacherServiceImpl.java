package com.teacher.CRUDOnTeacher.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teacher.CRUDOnTeacher.model.Teacher;
import com.teacher.CRUDOnTeacher.repository.TeacherRepo;

@Service
public class TeacherServiceImpl implements TeacherService {
	
	@Autowired
	TeacherRepo teacherRepo;
	
	@Override
	public Teacher addTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return teacherRepo.save(teacher);
	}

	@Override
	public List<Teacher> getTeacherList() {
		// TODO Auto-generated method stub
		return teacherRepo.findAll();
	}

	@Override
	public Teacher getDetailsByUsername(String teacherName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Teacher> findTeacherById(Integer id) {
		// TODO Auto-generated method stub
		return teacherRepo.findById(id);
	}

	@Override
	public Optional<Teacher> findTeacherByName(String teacherName) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Object updateTeacherDetailsById(Integer teacherId, Teacher teacher) {
		// TODO Auto-generated method stub
		Optional<Teacher> tService= teacherRepo.findById(teacherId);
		
		if(tService.isPresent()) {
			Teacher tObject= tService.get();
			tObject.setTeacherName(teacher.getTeacherName());
			tObject.setCollegeName(teacher.getCollegeName());
			tObject.setSalary(teacher.getSalary());
			
			Teacher newTeacher= teacherRepo.save(tObject);
			return newTeacher;
		}
		return "Invalid Teacher Id";
	}

	@Override
	public Object updateDetailsByName(String teacherName, Teacher teacher) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteTeacher(Integer id) {
		// TODO Auto-generated method stub 
		teacherRepo.deleteById(id);
	}

}
