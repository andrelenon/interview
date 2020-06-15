package com.alos.interview.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.alos.interview.dtos.CityDto;
import com.alos.interview.exception.InvalidFieldException;
import com.alos.interview.services.CityService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/v1/cidades/", produces = MediaType.APPLICATION_JSON_VALUE)
@Api(value = "API REST Cidades")
public class CityController {

	@Autowired
	private CityService service;

	@PostMapping
	@ApiOperation(value = "Insere uma cidade")
	public CityDto save(@Valid @RequestBody CityDto city) throws InvalidFieldException{
		return service.save(city);
	}

	@GetMapping("/nome/{name}")
	@ApiOperation(value = "Pesquisa uma cidade pelo nome")
	public List<CityDto> findByName(@PathVariable String name) throws InvalidFieldException{
		return service.findByName(name);
	}

	@GetMapping("/state/{state}")
	@ApiOperation(value = "Pesquisa uma cidade pelo seu estado")
	public List<CityDto> findByState(@PathVariable String state) throws InvalidFieldException{
		return service.findByState(state);
	}
	
	@ExceptionHandler
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public String handleInvalidFields(InvalidFieldException ex) {
		return ex.getMessage();
	}

}
