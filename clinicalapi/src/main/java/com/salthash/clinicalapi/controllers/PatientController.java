package com.salthash.clinicalapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.salthash.clinicalapi.model.Patient;
import com.salthash.clinicalapi.repos.PatientRepository;

@RestController
@RequestMapping("/api")
public class PatientController {
	
	private PatientRepository repository;

	//コンストラクタ
	@Autowired
	PatientController(PatientRepository repository){
		this.repository = repository;
	}
	
	//全データを取得する
	@RequestMapping(value="/patients", method=RequestMethod.GET)
	public List<Patient> getPatients(){
		return repository.findAll();
		
	}

}
