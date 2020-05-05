package com.salthash.clinicalapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.salthash.clinicalapi.model.Patient;
import com.salthash.clinicalapi.repos.PatientRepository;

@RestController
@RequestMapping("/api")
public class PatientController {

	private PatientRepository repository;

	// コンストラクタ
	@Autowired
	PatientController(PatientRepository repository) {
		this.repository = repository;
	}

	// 全データを取得する
	@RequestMapping(value = "/patients", method = RequestMethod.GET)
	public List<Patient> getPatients() {
		return repository.findAll();

	}

	//URLにて指定された１件を取得する
	@RequestMapping(value = "/patients/{id}", method = RequestMethod.GET)
	public Patient getPatient(@PathVariable("id") int i) {
		return repository.findById(i).get();

	}

	//１件を登録する
	@RequestMapping(value = "/patients", method = RequestMethod.POST)
	public Patient savePatient(Patient patient) {
		return repository.save(patient);
	}
	
	

}
