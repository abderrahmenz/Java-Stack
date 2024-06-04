package com.abderrahmen.spring.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@RequestMapping("/daikichi")
	public String anotherRoute() {
		return "daikichi";
	}

	@RequestMapping("/daikichi/today")
	public String serach() {
		return "Today you will find luck in all your endevors! ";
	}
	//http://localhost:{name}
	@RequestMapping("/daikichi/tomorrow")
	public String profile() {
		return "Tomorrow, on opportunity will arise, so be sure to be open to new ideas!";
	}
}
