package com.pratittech.praEdge.iot.dataStorage.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pratittech.praEdge.iot.dataStorage.entity.Device1;
import com.pratittech.praEdge.iot.dataStorage.entity.Plant;

public interface PlantRepository  extends MongoRepository<Plant,String>{

	public Device1 findByName(String name);
}
