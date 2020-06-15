package com.alos.interview.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alos.interview.dtos.ClientDto;
import com.alos.interview.dtos.UpdateClienteDto;
import com.alos.interview.exception.InvalidFieldException;
import com.alos.interview.models.ClientModel;
import com.alos.interview.repositories.ClientRepository;
import com.alos.interview.services.ClientService;
import com.alos.interview.util.ClientUtil;

@Service
public class ClientServiceImpl implements ClientService {

	private static final long serialVersionUID = -6918984531811380742L;

	@Autowired
	private ClientRepository repository;

	@Autowired
	private ClientUtil util;

	@Override
	@Transactional
	public ClientDto save(ClientDto clienteParam) throws InvalidFieldException {
		ClientModel entity = util.dtoToEntity(clienteParam);
		return util.entityToDto(repository.save(entity));
	}

	@Override
	@Transactional
	public List<ClientDto> findByName(String clientName) throws InvalidFieldException {
		return util.listEntityToListDto(repository.findByName(clientName.toLowerCase()));
	}

	@Override
	@Transactional
	public ClientDto findById(Long clientId) throws InvalidFieldException {
		ClientDto exit = null;
		Optional<ClientModel> model = repository.findById(clientId);
		if (model.isPresent()) {
			exit = util.entityToDto(model.get());
		}

		return exit;
	}

	@Override
	public Boolean deleteById(Long clientId) throws InvalidFieldException {
		Boolean saida = Boolean.FALSE;
		repository.deleteById(clientId);
		saida = Boolean.TRUE;
		return saida;
	}

	@Override
	@Transactional
	public ClientDto updateName(UpdateClienteDto client) throws InvalidFieldException {
		Optional<ClientModel> cli = repository.findById(client.getId());
		if(cli.isPresent()) {
			cli.get().setName(client.getName());
			return util.entityToDto(repository.save(cli.get()));
		}else {
			throw new InvalidFieldException("Código do cliente inválido!");
		}

	}

}
