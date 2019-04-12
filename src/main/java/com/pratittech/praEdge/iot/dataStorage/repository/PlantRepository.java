package com.pratittech.praEdge.iot.dataStorage.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pratittech.praEdge.iot.dataStorage.entity.Device;
import com.pratittech.praEdge.iot.dataStorage.entity.Plant;

public interface PlantRepository  extends MongoRepository<Plant,String>{

	public Device findByName(String name);
}
