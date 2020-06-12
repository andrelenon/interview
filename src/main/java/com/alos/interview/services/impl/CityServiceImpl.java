package com.alos.interview.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alos.interview.dtos.CityDto;
import com.alos.interview.models.CityModel;
import com.alos.interview.repositories.CityRepository;
import com.alos.interview.services.CityService;
import com.alos.interview.util.CityUtil;

@Service
public class CityServiceImpl implements CityService {

	@Autowired
	private CityRepository repository;

	@Override
	public CityDto save(CityDto dto) {
		CityModel city = CityUtil.dtoToEntity(dto);
		return CityUtil.entityToDto(repository.save(city));
	}

	@Override
	public List<CityDto> findCityByName(String name) {
		return CityUtil.listEntityToListDto(repository.findByNameContaining(name));
	}

	@Override
	public List<CityDto> findCityByState(String state) {
		return CityUtil.listEntityToListDto(repository.findByStateContaining(state));
	}

}
