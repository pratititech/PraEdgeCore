package com.pratittech.praEdge.iot.dataStorage.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pratittech.praEdge.iot.dataStorage.entity.Plant;
import com.pratittech.praEdge.iot.dataStorage.repository.PlantRepository;

@Component
public class PlantService {

	@Autowired
	private PlantRepository plantRepository;
	

	public void createPlant(Plant request) {
		request.setCreatedDate(new Date());
		plantRepository.save(request);
	}

	public Optional<Plant> getPlant(String plantId) {
		return plantRepository.findById(plantId);
	}

	public void updatePlant(String plantId, Plant request) {
		plantRepository.save(request);
		
	}

	public List<Plant> getAllPlants() {
		return plantRepository.findAll();
	}

	public void deletePlant(String plantId) {
		plantRepository.deleteById(plantId);
		
	}

}
