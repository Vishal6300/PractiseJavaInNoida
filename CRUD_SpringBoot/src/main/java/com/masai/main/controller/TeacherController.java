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

import com.masai.main.model.Teacher;
import com.masai.main.service.TeacherService;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
		@Autowired
		TeacherService teacherService;
		
		@PostMapping("/addTeacher")
		public Teacher addTeacher(@RequestBody Teacher teacher) {
			
			return teacherService.addTeacher(teacher);
		}
		
		@GetMapping("viewAllTeacher")
		public List<Teacher> viewAllTeacher(){
			return teacherService.viewAllTeacher();
		}
		
		@GetMapping("/searchTeacherById/{id}")
		public Optional<Teacher> findTeacherById(@PathVariable Integer id){
			return teacherService.findTeacherById(id);
		}
		
		@DeleteMapping("/deleteTeacherById/{id}")
		public void deleteTeacherById(@PathVariable Integer id) {
			teacherService.deleteTeacherById(id);
		}
		
		@PutMapping("/updateTeacherData/{id}")
		public Object updateTeacherById(@PathVariable Integer id,@RequestBody Teacher teacher) {
			return teacherService.updateTeacherData(id,teacher);
		}
		
}
