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

import com.pratittech.praEdge.iot.dataStorage.entity.Device;
import com.pratittech.praEdge.iot.dataStorage.service.DeviceService;

@RestController
@RequestMapping(path = "/")
public class DeviceController {
	
@Autowired
 private DeviceService deviceService;

@PostMapping("/devices")	
public void createDevice(@RequestBody Device request){
	deviceService.createDevice(request);
}

@GetMapping("/devices/{deviceId}")
public Optional<Device> getDevice(@PathVariable("deviceId") String deviceId) {
	return deviceService.getDevice(deviceId);
}
@PutMapping("/devices/{deviceId}")
public void updateDevice(@PathVariable("deviceId")  String deviceId,@RequestBody Device request) {
	deviceService.updateDevice(deviceId,request);
}

@GetMapping("/devices")
public List<Device> listAllDevices() {
	return deviceService.getAllDevices();
}

@DeleteMapping("/devices/{deviceId}")
public void deleteDevice(@PathVariable("deviceId") String deviceId) {
	deviceService.deleteDevice(deviceId);
}
}
