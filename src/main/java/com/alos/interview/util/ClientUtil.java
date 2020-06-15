package com.alos.interview.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alos.interview.dtos.ClientDto;
import com.alos.interview.models.ClientModel;

@Service
public class ClientUtil {
	
	@Autowired
	private CityUtil cityUtil;

	public ClientDto entityToDto(ClientModel client) {

		ClientDto dto = new ClientDto();
		dto.setId(client.getId());
		dto.setName(client.getName());
		dto.setGender(client.getGender());
		dto.setDtBirth(Util.dateToString(client.getDtBirth()));
		dto.setAge(client.getAge());
		if (!Util.isEmptyOrNull(client.getCity())) {
			dto.setCity(cityUtil.entityToDto(client.getCity()));
		}

		return dto;
	}

	public ClientModel dtoToEntity(ClientDto dto) {

		ClientModel model = new ClientModel();
		model.setId(dto.getId());
		model.setName(dto.getName());
		model.setGender(dto.getGender());
		model.setDtBirth(Util.stringToDate(dto.getDtBirth()));
		model.setAge(dto.getAge());
		if (!Util.isEmptyOrNull(dto.getCity())) {
			model.setCity(cityUtil.dtoToEntity(dto.getCity()));
		}

		return model;

	}

	public List<ClientDto> listEntityToListDto(List<ClientModel> listModel) {
		List<ClientDto> listDto = new ArrayList<ClientDto>();
		for (ClientModel model : listModel) {
			ClientDto dto = new ClientDto();
			dto.setId(model.getId());
			dto.setName(model.getName());
			dto.setGender(model.getGender());
			dto.setDtBirth(Util.dateToString(model.getDtBirth()));
			dto.setAge(model.getAge());
			if (!Util.isEmptyOrNull(model.getCity())) {
				dto.setCity(cityUtil.entityToDto(model.getCity()));
			}
			listDto.add(dto);
			
		}
		return listDto;

	}

}
