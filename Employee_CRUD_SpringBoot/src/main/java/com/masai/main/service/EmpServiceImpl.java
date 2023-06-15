package com.masai.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.masai.main.model.Employee;
import com.masai.main.repository.EmpRepo;

@Service
public class EmpServiceImpl implements EmpService{
	
	@Autowired
	EmpRepo empRepo;

	@Override
	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return empRepo.save(emp);
	}

	@Override
	public List<Employee> viewEmployee() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}

	@Override
	public Optional<Employee> empGetById(Integer empId) {
		// TODO Auto-generated method stub
		return empRepo.findById(empId);
	}

}
