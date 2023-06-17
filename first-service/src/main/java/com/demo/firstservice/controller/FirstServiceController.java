package com.demo.firstservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class FirstServiceController {
	
	@GetMapping(value = "/hello")
	public String helloWorld() {
		return "Hello world!";
	}

}
