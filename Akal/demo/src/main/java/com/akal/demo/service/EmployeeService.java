package com.akal.demo.service;

import com.akal.demo.model.Employee;
import org.springframework.http.ResponseEntity;

public interface EmployeeService {
    ResponseEntity<Object> addEmployee(Employee employee);
    ResponseEntity<Object> updateEmployee(Employee employee);
    ResponseEntity<Object> viewAllEmployee();
    ResponseEntity<Object> findEmployeeById(String empId);
}
