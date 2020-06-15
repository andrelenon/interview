package com.alos.interview.dtos;

import javax.validation.constraints.NotEmpty;

public class ClientDto {

	private Long id;
	@NotEmpty(message = "O campo Nome não pode estar vazio")
	private String name = "";
	@NotEmpty(message = "O campo Sexo não pode estar vazio")
	private String gender;
	@NotEmpty(message = "O campo Data de nascimento não pode estar vazio")
	private String dtBirth;
	@NotEmpty(message = "O campo Idade não pode estar vazio")
	private int age;
	private CityDto city;

	public Long getId() {
		return id;
	}

	public void setId(Long idParam) {
		this.id = idParam;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDtBirth() {
		return dtBirth;
	}

	public void setDtBirth(String dtBirth) {
		this.dtBirth = dtBirth;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public CityDto getCity() {
		return city;
	}

	public void setCity(CityDto city) {
		this.city = city;
	}

}
