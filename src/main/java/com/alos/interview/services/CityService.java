package com.alos.interview.services;

import java.util.List;

import com.alos.interview.dtos.CityDto;

public interface CityService {

	public CityDto save(CityDto city);

	public List<CityDto> findCityByName(String name);

	public List<CityDto> findCityByState(String state);

}
