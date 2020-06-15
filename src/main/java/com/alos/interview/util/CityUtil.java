package com.alos.interview.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.alos.interview.dtos.CityDto;
import com.alos.interview.models.CityModel;

@Service
public class CityUtil {

	public CityDto entityToDto(CityModel model) {

		CityDto dto = new CityDto();
		dto.setId(model.getId());
		dto.setName(model.getName());
		dto.setState(model.getState());

		return dto;
	}

	public CityModel dtoToEntity(CityDto dto) {

		CityModel model = new CityModel();
		model.setId(dto.getId());
		model.setName(dto.getName());
		model.setState(dto.getState());
		return model;

	}

	public List<CityDto> listEntityToListDto(List<CityModel> listModel) {
		List<CityDto> saida = new ArrayList<CityDto>();
		for (CityModel model : listModel) {
			CityDto dto = new CityDto();
			dto.setId(model.getId());
			dto.setName(model.getName());
			dto.setState(model.getState());
			saida.add(dto);
		}
		return saida;
	}

}
