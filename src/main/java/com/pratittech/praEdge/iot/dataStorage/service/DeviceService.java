package com.pratittech.praEdge.iot.dataStorage.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pratittech.praEdge.iot.dataStorage.entity.Device1;
import com.pratittech.praEdge.iot.dataStorage.repository.DeviceRepository;

@Component
public class DeviceService {

@Autowired
private DeviceRepository  deviceRepository;

public void createDevice( Device1 device) {
	deviceRepository.save(device);
}

public void updateDevice(String deviceId, Device1 device) {
	deviceRepository.save(device);
}

public void deleteDevice(String deviceId) {
	deviceRepository.deleteById(deviceId);
}

public List<Device1> getAllDevices() {
	return deviceRepository.findAll();
	
}

public Optional<Device1> getDevice(String deviceId) {
	return deviceRepository.findById(deviceId);
	
}
}
