package com.salthash.clinicalapi.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salthash.clinicalapi.model.ClinicalData;

public interface ClinicalDataRepository extends JpaRepository<ClinicalData, Integer> {

}
