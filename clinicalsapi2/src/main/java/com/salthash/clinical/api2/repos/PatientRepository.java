package com.salthash.clinical.api2.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salthash.clinical.api2.model.Patient;


public interface PatientRepository extends JpaRepository<Patient, Integer> {

	List<Patient> findByFirstNameContainingOrLastNameContaining(String firstName, String lastName);

}
