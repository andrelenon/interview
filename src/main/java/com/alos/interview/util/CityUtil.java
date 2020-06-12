package com.alos.interview.util;

import java.util.ArrayList;
import java.util.List;

import com.alos.interview.dtos.CityDto;
import com.alos.interview.models.CityModel;

public class CityUtil {

	public static CityDto entityToDto(CityModel city) {

		CityDto dto = new CityDto();
		dto.setId(city.getId());
		dto.setName(city.getName());
		dto.setState(city.getState());

		return dto;
	}

	public static CityModel dtoToEntity(CityDto dto) {

		CityModel model = new CityModel();
		model.setId(dto.getId());
		model.setName(dto.getName());
		model.setState(dto.getState());
		return model;

	}
	
	public static List<CityDto> listEntityToListDto(List<CityModel> listModel){
		List<CityDto> listDto = new  ArrayList<>();
		listModel.forEach(client -> {
			listDto.add(entityToDto(client));
		});
		return listDto;
	}

}
