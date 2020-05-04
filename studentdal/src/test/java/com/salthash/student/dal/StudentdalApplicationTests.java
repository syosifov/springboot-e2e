package com.salthash.student.dal;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.salthash.student.dal.entities.Student;
import com.salthash.student.dal.repos.StudentRepository;


//@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentdalApplicationTests {
	
	@Autowired
	private StudentRepository studentRepository;

	@Test
	public void testCreateStudent() {
		
		Student student = new Student();
		student.setName("John Hopkins");
		student.setCourse("Java Web Services");
		student.setFee(30d);
		
		studentRepository.save(student);		
		
	}
	
	@Test
	public void testFindStudentById() {
		Optional<Student> student = studentRepository.findById(1l);
		System.out.println(student);
		
	}
	
	@Test
	public void testUpdateStudentById() {
		Student student = studentRepository.findById(5l).get();
		student.setFee(40d);
		
		studentRepository.save(student);
		
	}
	
	@Test
	public void testDeleteStudent() {
		Student student = new Student();
		student.setId(5l);
		studentRepository.delete(student);
	}

}
