package com.alos.interview.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alos.interview.dtos.CityDto;
import com.alos.interview.exception.InvalidFieldException;
import com.alos.interview.models.CityModel;
import com.alos.interview.repositories.CityRepository;
import com.alos.interview.services.CityService;
import com.alos.interview.util.CityUtil;

@Service
public class CityServiceImpl implements CityService {

	private static final long serialVersionUID = 7281102946399039557L;
	
	@Autowired
	private CityRepository repository;
	
	@Autowired
	private CityUtil util;

	@Override
	public CityDto save(CityDto city) throws InvalidFieldException{
		CityModel entity = util.dtoToEntity(city);
		return util.entityToDto(repository.save(entity));
	}

	@Override
	public List<CityDto> findByName(String name) throws InvalidFieldException{
		return util.listEntityToListDto(repository.findByName(name.toLowerCase()));
	}

	@Override
	public List<CityDto> findByState(String state) throws InvalidFieldException{
		return util.listEntityToListDto(repository.findByState(state.toLowerCase()));
	}

}
