package com.chandra.spring.jpa.h2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chandra.spring.jpa.h2.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

  List<Student> findByNameContaining(String name);

}
