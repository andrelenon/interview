package com.alos.interview.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alos.interview.models.CityModel;

@Repository
public interface CityRepository extends JpaRepository<CityModel, Long> {
	
	public List<CityModel> findByNameContaining(String name);
	
	public List<CityModel> findByStateContaining (String state);

}
