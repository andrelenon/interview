package com.alos.interview.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alos.interview.models.CityModel;

@Repository
public interface CityRepository extends CrudRepository<CityModel, Long> {
	
	List<CityModel> findByName(String name);
	
	List<CityModel> findByState (String state);

}
