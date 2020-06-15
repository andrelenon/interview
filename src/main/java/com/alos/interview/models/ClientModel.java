package com.alos.interview.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name = "cliente")
public class ClientModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name = "";
	private String gender;
	private Date dtBirth;
	private int age;
	@OneToOne(cascade = CascadeType.ALL)
	private CityModel city;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long idParam) {
		this.id = idParam;
	}
	public String getName() {
		return name;
	}
	public void setName(String nameParam) {
		this.name = nameParam;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String genderParam) {
		this.gender = genderParam;
	}
	public Date getDtBirth() {
		return dtBirth;
	}
	public void setDtBirth(Date dtBirthParam) {
		this.dtBirth = dtBirthParam;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int ageParam) {
		this.age = ageParam;
	}
	public CityModel getCity() {
		return city;
	}
	public void setCity(CityModel cityParam) {
		this.city = cityParam;
	}
	
	

}
