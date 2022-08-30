package com.rishah.spring.jpa.learning.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.rishah.spring.jpa.learning.entity.Guardian;
import com.rishah.spring.jpa.learning.entity.Student;

@SpringBootTest
class StudentRepositotryTest {

	@Autowired
	private StudentRepository repo;
	
	@Test
	public void saveStudent() {
		
		/*
		 * Student student = new Student("rishabh",
		 * "kaushik","kaushikrishabh20@gmail.com", "rish", "rishabhkaushik@gmail.com",
		 * "9671390067");
		 * 
		 * Student student2 = new Student(111,"rishabh",
		 * "kaushik","kaushikrishabh20@gmail.com", "rish", "rishabhkaushik@gmail.com",
		 * "9671390067");
		 * 
		 * repo.save(student);
		 */
		
	}
	
	@Test
	public void saveStudentWithGuardian() {
		
		Guardian guardian = new Guardian("rish","kaushikrishabh20@gmail.com","9671390067");
		
		Student student = new Student("rishabh", "kaushik","kaushikrishabh20@gmail.com",guardian);
		
		repo.save(student);
	}
	
	@Test
	public void printAllStudent() {
		
		List<Student> student = repo.findAll();
		System.out.println("Students: "+ student.toString());
	}

}
