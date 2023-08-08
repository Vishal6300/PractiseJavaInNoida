package com.masai.StudentCRUDSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jakarta.persistence.Id;

public interface StudentRepo extends JpaRepository<Integer, Id>{
		
}
