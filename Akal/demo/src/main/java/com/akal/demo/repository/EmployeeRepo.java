package com.akal.demo.repository;

import com.akal.demo.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends MongoRepository<Employee, String> {
    List<Employee> findByDepartmentId(String departmentId);
}
