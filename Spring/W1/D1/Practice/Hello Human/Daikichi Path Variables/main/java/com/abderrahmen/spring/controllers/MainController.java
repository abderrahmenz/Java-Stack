package com.abderrahmen.spring.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@RequestMapping("/daikichi/travel/Honolulu")
	public String home() {
		return "Congrats! You will soon travel to Honolulu!";
	}
	@RequestMapping("/daikichi/lotto/{number}")
	public String profile(@PathVariable("number") Integer number) {
		if (number % 2 ==0) {
			return "You will take a grand journey in the near future, but be wary of tempting offers";
		}
		return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends";
	}
}
