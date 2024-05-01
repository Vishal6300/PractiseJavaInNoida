package com.teacher.CRUDOnTeacher.service;

import java.util.List;
import java.util.Optional;

import com.teacher.CRUDOnTeacher.model.Teacher;

public interface TeacherService {
	public Teacher addTeacher(Teacher teacher);
	public List<Teacher> getTeacherList();
	public Teacher getDetailsByUsername(String teacherName);
	public Optional<Teacher> findTeacherById(Integer id);
	public Optional<Teacher> findTeacherByName(String teacherName);
	public Object updateTeacherDetailsById(Integer teacherId, Teacher teacher);
	public Object updateDetailsByName(String teacherName, Teacher teacher);
	public void deleteTeacher(Integer id);
}
