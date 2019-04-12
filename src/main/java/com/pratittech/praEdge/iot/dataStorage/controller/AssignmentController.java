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

import com.pratittech.praEdge.iot.dataStorage.entity.DeviceAssignment;
import com.pratittech.praEdge.iot.dataStorage.service.AssignmentService;

@RestController
@RequestMapping(path = "/")
public class AssignmentController {
	
@Autowired
 private AssignmentService assignmentService;

@PostMapping("/assignments")	
public void createDevice(@RequestBody DeviceAssignment request){
	assignmentService.createAssignment(request);
}

@GetMapping("/assignments/{assignmentId}")
public Optional<DeviceAssignment> getDevice(@PathVariable("assignmentId") String assignmentId) {
	return assignmentService.getAssignment(assignmentId);
}
@PutMapping("/assignments/{assignmentId}")
public void updateDevice(@PathVariable("assignmentId")  String assignmentId,@RequestBody DeviceAssignment request) {
	assignmentService.updateAssignment(assignmentId,request);
}

@GetMapping("/assignments")
public List<DeviceAssignment> listAllDevices() {
	return assignmentService.getAllAssignment();
}

@DeleteMapping("/assignments/{assignmentId}")
public void deleteDevice(@PathVariable("assignmentId") String assignmentId) {
	assignmentService.deleteAssignment(assignmentId);
}
}
