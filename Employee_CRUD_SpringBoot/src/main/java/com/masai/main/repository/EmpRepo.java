package com.masai.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.main.model.Employee;

@Repository
public interface EmpRepo extends JpaRepository<Employee, Integer>{

}
