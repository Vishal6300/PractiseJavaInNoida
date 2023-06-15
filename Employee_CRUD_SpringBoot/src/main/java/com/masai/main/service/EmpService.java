package com.masai.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.masai.main.model.Employee;

@Service
public interface EmpService {
	public Employee addEmployee(Employee emp);
	public List<Employee> viewEmployee();
	public Optional<Employee> empGetById(Integer empId);
}
