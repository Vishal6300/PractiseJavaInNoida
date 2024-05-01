package com.akal.demo.repository;

import com.akal.demo.model.Department;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepo extends MongoRepository<Department, String> {
}
