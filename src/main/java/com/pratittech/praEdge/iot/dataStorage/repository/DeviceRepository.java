package com.pratittech.praEdge.iot.dataStorage.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pratittech.praEdge.iot.dataStorage.entity.Device1;

public interface DeviceRepository  extends MongoRepository<Device1,String>{

	public Device1 findByName(String name);
}
