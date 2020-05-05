package com.salthash.clinicalapi.model;

import java.security.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ClinicalData {
	
	@Id
	private int id;
	private String componentName;
	private String componentValue;
	private Timestamp mesuredDateTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getComponentName() {
		return componentName;
	}

	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}

	public String getComponentValue() {
		return componentValue;
	}

	public void setComponentValue(String componentValue) {
		this.componentValue = componentValue;
	}

	public Timestamp getMesuredDateTime() {
		return mesuredDateTime;
	}

	public void setMesuredDateTime(Timestamp mesuredDateTime) {
		this.mesuredDateTime = mesuredDateTime;
	}

}
