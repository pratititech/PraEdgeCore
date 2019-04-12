package com.pratittech.praEdge.iot.dataStorage.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pratittech.praEdge.iot.dataStorage.entity.Measurements;

public interface MeasurementRepository extends MongoRepository<Measurements,String> {

}
