package com.akal.demo.service;

import com.akal.demo.model.Department;
import org.springframework.http.ResponseEntity;

public interface DepartmentService {
    ResponseEntity<Object> addDepartment(Department department);
    ResponseEntity<Object> viewEmployeeListByDepartmentId(String departmentId);
    ResponseEntity<Object> viewDepartmentList();

}
