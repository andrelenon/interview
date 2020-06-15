package com.alos.interview.dtos;

import javax.validation.constraints.NotEmpty;

public class CityDto {

	private Long id;
	@NotEmpty(message = "O campo Nome não pode estar vazio")
	private String name;
	@NotEmpty(message = "O campo Estado não pode estar vazio")
	private String state;

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

	public String getState() {
		return state;
	}

	public void setState(String stateParam) {
		this.state = stateParam;
	}

}
