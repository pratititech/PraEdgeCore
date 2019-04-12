package com.pratittech.praEdge.iot.dataStorage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pratittech.praEdge.iot.dataStorage.entity.Measurements;
import com.pratittech.praEdge.iot.dataStorage.service.MeasurementService;

@RestController
@RequestMapping(path = "/measurements")
public class MeasurementController {
	
@Autowired
private MeasurementService measurementService;

@PostMapping("/{assignmentId}")	
public void postData(@RequestBody Measurements request){
	//check propertyname and value datatype exists in Device DB.
	//measurementService.validateRequest(request);
	measurementService.postData(request);
}

@GetMapping("/{assignmentId}")
public void getPropertyValue(@RequestParam(name ="select") String propertyName) {
	
}

}
