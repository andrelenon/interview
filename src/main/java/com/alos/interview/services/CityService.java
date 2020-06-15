package com.alos.interview.services;

import java.io.Serializable;
import java.util.List;

import com.alos.interview.dtos.CityDto;
import com.alos.interview.exception.InvalidFieldException;

public interface CityService extends Serializable{

	public CityDto save(CityDto city) throws InvalidFieldException;

	public List<CityDto> findByName(String name) throws InvalidFieldException;

	public List<CityDto> findByState(String state) throws InvalidFieldException;

}
