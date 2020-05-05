package com.salthash.clinicalapi.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salthash.clinicalapi.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
	

}
