package com.alos.interview.controllers;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.alos.interview.dtos.ClientDto;
import com.alos.interview.dtos.UpdateClienteDto;
import com.alos.interview.exception.InvalidFieldException;
import com.alos.interview.services.ClientService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/v1/clientes/", produces = MediaType.APPLICATION_JSON_VALUE)
@Api(value = "API REST Clientes")
public class ClientController {

	@Autowired
	private ClientService clienteService;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	@ApiOperation(value = "Insere um cliente")
	public ClientDto insert(@Valid @RequestBody ClientDto clientParam) throws InvalidFieldException{
		return clienteService.save(clientParam);
	}	
	

	@GetMapping("/name/{clientName}")
	@ApiOperation(value = "Pesquisa um cliente pelo nome")
	public List<ClientDto> findByName(@PathVariable @NotNull String clientName) throws InvalidFieldException{
		return clienteService.findByName(clientName);
	}
	

	@GetMapping("/{id}")
	@ApiOperation(value = "Pesquisa um cliente pelo ID")
	public ClientDto findById(@PathVariable Long id) throws InvalidFieldException{
		return clienteService.findById(id);
	}
	

	@DeleteMapping("/{id}")
	@ApiOperation(value = "Deleta um cliente")
	public Boolean deleteById(@PathVariable @NotNull Long id) throws InvalidFieldException{
		return clienteService.deleteById(id);
	}

	@PutMapping
	@ApiOperation(value = "Altera o nome de um cliente")
	public ClientDto updateClienteName(@RequestBody UpdateClienteDto client) throws InvalidFieldException{
		return clienteService.updateName(client);
	}
	
	@ExceptionHandler
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public String handleInvalidFields(InvalidFieldException ex) {
		return ex.getMessage();
	}

}
