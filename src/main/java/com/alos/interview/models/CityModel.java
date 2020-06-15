package com.alos.interview.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "cidade")
public class CityModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String state = "";
	private String name = "";
	
	public Long getId() {
		return id;
	}
	public void setId(Long idParam) {
		this.id = idParam;
	}
	public String getState() {
		return state;
	}
	public void setState(String stateParam) {
		this.state = stateParam;
	}
	public String getName() {
		return name;
	}
	public void setName(String nameParam) {
		this.name = nameParam;
	}

}
