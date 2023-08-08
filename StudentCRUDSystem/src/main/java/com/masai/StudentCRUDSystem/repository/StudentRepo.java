package com.masai.StudentCRUDSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.StudentCRUDSystem.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{
		
}
