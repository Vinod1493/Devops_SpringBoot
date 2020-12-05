package com.vinod.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("Hello")
	public String sayHello() {
		return "Hello Vinod, Welcome to devops world";
	}
	
}
