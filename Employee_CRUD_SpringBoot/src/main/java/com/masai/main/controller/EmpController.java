package com.masai.main.controller;

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

import com.masai.main.model.Employee;
import com.masai.main.service.EmpService;

@RestController
@RequestMapping("/employee")
public class EmpController {
	
	@Autowired
	EmpService empService;
	
	@PostMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee emp) {
		return empService.addEmployee(emp);
	}
	
	@GetMapping("/viewAllEmployee")
	public List<Employee> viewEmployee() {
		return empService.viewEmployee();
	}
	
	@GetMapping("/getEmpById/{id}")
	public Optional<Employee> empGetById(@PathVariable Integer id) {
		return empService.empGetById(id);
	}
	
	@PutMapping("/updateEmpData/{id}")
	public Object UpdateEmployeeDetails(@PathVariable Integer id,@RequestBody Employee employee) {
		return empService.updateEmployeeData(id, employee);
	}
	
}
