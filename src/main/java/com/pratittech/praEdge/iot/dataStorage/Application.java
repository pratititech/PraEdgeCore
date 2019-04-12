package com.pratittech.praEdge.iot.dataStorage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pratittech.praEdge.iot.dataStorage.repository.DeviceRepository;

@SpringBootApplication
public class Application {
//implements CommandLineRunner {

@Autowired
private DeviceRepository deviceRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

	/*@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		deviceRepository.deleteAll();
		deviceRepository.save(new Device("nano device"));
		// fetch all devices
				System.out.println("Devices found with findAll():");
				System.out.println("-------------------------------");
				for (Device device : deviceRepository.findAll()) {
					System.out.println(device);
				}
				System.out.println();

				// fetch an individual customer
				System.out.println("device found with findByname('nanoDevice'):");
				System.out.println("--------------------------------");
				System.out.println(deviceRepository.findByName("nano device"));

				

	}
	*/
}