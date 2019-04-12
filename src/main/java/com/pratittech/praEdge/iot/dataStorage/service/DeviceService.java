package com.pratittech.praEdge.iot.dataStorage.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pratittech.praEdge.iot.dataStorage.entity.Device;
import com.pratittech.praEdge.iot.dataStorage.repository.DeviceRepository;

@Component
public class DeviceService {

@Autowired
private DeviceRepository  deviceRepository;

public void createDevice( Device device) {
	deviceRepository.save(device);
}

public void updateDevice(String deviceId, Device device) {
	deviceRepository.save(device);
}

public void deleteDevice(String deviceId) {
	deviceRepository.deleteById(deviceId);
}

public List<Device> getAllDevices() {
	return deviceRepository.findAll();
	
}

public Optional<Device> getDevice(String deviceId) {
	return deviceRepository.findById(deviceId);
	
}
}
