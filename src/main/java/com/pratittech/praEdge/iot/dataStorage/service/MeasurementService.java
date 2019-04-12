package com.pratittech.praEdge.iot.dataStorage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pratittech.praEdge.iot.dataStorage.entity.Measurements;
import com.pratittech.praEdge.iot.dataStorage.repository.MeasurementRepository;

@Component
public class MeasurementService {

	@Autowired
	private MeasurementRepository measurementRepository;
	
	public void postData(Measurements request) {
		measurementRepository.save(request);
	}

	public void validateRequest(Measurements request) {
		// TODO Auto-generated method stub
		
	}

}
