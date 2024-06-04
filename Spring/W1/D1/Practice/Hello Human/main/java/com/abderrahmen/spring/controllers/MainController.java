package com.abderrahmen.spring.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@RequestMapping("/")
	public String home() {
		return "Hello Human";
	}
	@RequestMapping("/{name}")
	public String profile(@PathVariable("name") String name) {
		return "Hello " + name;
	}
}
