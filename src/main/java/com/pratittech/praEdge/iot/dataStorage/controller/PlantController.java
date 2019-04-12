package com.pratittech.praEdge.iot.dataStorage.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pratittech.praEdge.iot.dataStorage.entity.Plant;
import com.pratittech.praEdge.iot.dataStorage.service.PlantService;

@RestController
@RequestMapping(path = "/")
public class PlantController {
	
@Autowired
 private PlantService plantService;

@PostMapping("/plants")	
public void createPlant(@RequestBody Plant request){
	plantService.createPlant(request);
}

@GetMapping("/plants/{plantId}")
public Optional<Plant> getPlant(@PathVariable("plantId") String plantId) {
	return plantService.getPlant(plantId);
}
@PutMapping("/plants/{plantId}")
public void updatePlant(@PathVariable("plantId")  String plantId,@RequestBody Plant request) {
	plantService.updatePlant(plantId,request);
}

@GetMapping("/plants")
public List<Plant> listAllPlants() {
	return plantService.getAllPlants();
}

@DeleteMapping("/plants/{plantId}")
public void deletePlant(@PathVariable("plantId") String plantId) {
	plantService.deletePlant(plantId);
}
}
