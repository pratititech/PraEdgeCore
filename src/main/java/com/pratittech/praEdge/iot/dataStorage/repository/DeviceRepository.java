package com.pratittech.praEdge.iot.dataStorage.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pratittech.praEdge.iot.dataStorage.entity.Device;


public interface DeviceRepository  extends MongoRepository<Device,String>{

	public Device findByName(String name);
}
