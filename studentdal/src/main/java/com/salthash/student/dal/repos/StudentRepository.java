package com.salthash.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.salthash.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
