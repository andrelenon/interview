package com.alos.interview.dtos;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class CityDto {

	private long id;
	@NotNull(message = "O campo Nome não pode ser nulo")
	@NotEmpty(message = "O campo Nome não pode estar vazio")
	private String name;
	@NotNull(message = "O campo Estado não pode ser nulo")
	@NotEmpty(message = "O campo Estado não pode estar vazio")
	private String state;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
