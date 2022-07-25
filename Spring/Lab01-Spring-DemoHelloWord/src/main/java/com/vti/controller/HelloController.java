package com.vti.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/helloword")
@CrossOrigin("*")
public class HelloController {

	@GetMapping()
	public String getHello(@RequestParam(name = "name")  String name) {
		return "Hello "+ name;
	}
	
	@PostMapping()
	public String postHello() {
		return "Hello post";
	}
	
	@PutMapping()
	public String putHello() {
		return "Hello put";
	}
}
