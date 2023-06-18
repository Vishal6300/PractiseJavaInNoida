package com.masai.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.main.model.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer>{

}
