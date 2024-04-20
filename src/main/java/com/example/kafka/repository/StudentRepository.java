package com.example.kafka.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.kafka.domain.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {
    
}
