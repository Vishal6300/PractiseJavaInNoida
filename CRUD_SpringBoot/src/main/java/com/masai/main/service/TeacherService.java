package com.masai.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.masai.main.model.Teacher;

@Service
public interface TeacherService {
	public Teacher addTeacher(Teacher teacher);
	public List<Teacher> viewAllTeacher();
	public Optional<Teacher> findTeacherById(Integer id);
	public void deleteTeacherById(Integer id);
	public Object updateTeacherData(Integer id, Teacher teacher);
	
}
