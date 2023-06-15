package com.masai.main.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.masai.main.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

	Optional<Student> findByRollNo(Integer rollNo);

	//@Query("delete from Student s where s.rollNo='rollNo'")
	void deleteByRollNo(Integer rollNo);

	
}
