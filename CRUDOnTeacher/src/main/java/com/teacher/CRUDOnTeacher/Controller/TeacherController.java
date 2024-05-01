package com.teacher.CRUDOnTeacher.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teacher.CRUDOnTeacher.model.Teacher;
import com.teacher.CRUDOnTeacher.service.TeacherService;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
	
	@Autowired
	TeacherService teacherService;
	
	@PostMapping("/addTeacher")
	public Teacher addTeacher(@RequestBody Teacher teacher) {
		return teacherService.addTeacher(teacher);
	}
	
	@GetMapping("/getTeacherList")
	public List<Teacher> getTeacherList(){
		return teacherService.getTeacherList();
	}
	
	@GetMapping("/searchById/{id}")
	public Optional<Teacher> findTeacherById(@PathVariable Integer id){
		return teacherService.findTeacherById(id);
	}
	
	@PutMapping("/updateTeacherById/{id}")
	public Object updateTeacherDetailsById(@PathVariable Integer teacherId,@RequestBody Teacher teacher) {
		return teacherService.updateTeacherDetailsById(teacherId, teacher);
	}

}
