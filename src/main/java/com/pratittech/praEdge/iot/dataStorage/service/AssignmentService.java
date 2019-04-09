package com.pratittech.praEdge.iot.dataStorage.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pratittech.praEdge.iot.dataStorage.entity.DeviceAssignment;
import com.pratittech.praEdge.iot.dataStorage.repository.AssignmentRepository;
@Component
public class AssignmentService {

	@Autowired
	private AssignmentRepository  assignmentRepository;
	
	
	public void createAssignment(DeviceAssignment request) {
		assignmentRepository.save(request);
		
	}

	public Optional<DeviceAssignment> getAssignment(String assignmentId) {
		return assignmentRepository.findById(assignmentId);
	}

	public void updateAssignment(String assignmentId, DeviceAssignment request) {
		assignmentRepository.save(request);
	}

	public List<DeviceAssignment> getAllAssignment() {
		return assignmentRepository.findAll();
	}

	public void deleteAssignment(String assignmentId) {
		assignmentRepository.deleteById(assignmentId);
		
	}

}
