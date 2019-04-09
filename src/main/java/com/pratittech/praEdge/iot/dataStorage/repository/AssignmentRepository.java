package com.pratittech.praEdge.iot.dataStorage.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pratittech.praEdge.iot.dataStorage.entity.DeviceAssignment;

public interface AssignmentRepository extends MongoRepository<DeviceAssignment,String>{

}
