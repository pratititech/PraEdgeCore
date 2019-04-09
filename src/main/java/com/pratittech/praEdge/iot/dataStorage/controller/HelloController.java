package com.pratittech.praEdge.iot.dataStorage.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public void hello() {
		System.out.println("Hello");
	}
	

	@RequestMapping("/")
	public String respond() {
		return "running your application";
	}
}
