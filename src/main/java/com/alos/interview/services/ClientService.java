package com.alos.interview.services;

import java.io.Serializable;
import java.util.List;

import com.alos.interview.dtos.ClientDto;
import com.alos.interview.dtos.UpdateClienteDto;
import com.alos.interview.exception.InvalidFieldException;

public interface ClientService extends Serializable{
	
	public ClientDto save(ClientDto clienteParam) throws InvalidFieldException;
	
	public List<ClientDto> findByName(String clientName) throws InvalidFieldException;
	
	public ClientDto findById(Long clientId) throws InvalidFieldException;
	
	public Boolean deleteById(Long clientId) throws InvalidFieldException;
	
	public ClientDto updateName(UpdateClienteDto client) throws InvalidFieldException;

}
