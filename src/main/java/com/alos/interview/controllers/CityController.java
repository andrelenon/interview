package com.alos.interview.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alos.interview.dtos.CityDto;
import com.alos.interview.services.CityService;

@RestController
@RequestMapping(value = "/cities/", produces = MediaType.APPLICATION_JSON_VALUE)
public class CityController {

	@Autowired
	private CityService service;

	@PostMapping
	public CityDto saveCity(@Valid @RequestBody CityDto city) {
		return service.save(city);
	}

	@GetMapping("/name/{name}")
	public List<CityDto> findByName(@PathVariable String name) {
		return service.findCityByName(name);
	}

	@GetMapping("/state/{state}")
	public List<CityDto> findByState(@PathVariable String state) {
		return service.findCityByState(state);
	}

}
