package com.rishah.spring.jpa.learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rishah.spring.jpa.learning.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
