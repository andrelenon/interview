package com.alos.interview.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alos.interview.models.ClientModel;

@Repository
public interface ClientRepository extends CrudRepository<ClientModel, Long> {

	List<ClientModel> findByName(String name);

}
