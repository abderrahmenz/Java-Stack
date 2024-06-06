package com.abderrahmen.spring.controllers;


import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//... imports (Use shift+ctrl+O or shift+cmd+O to import as you code)
@Controller
public class MainController {

	@RequestMapping("/")
	public String index(Model model) {

		ArrayList<Item> fruits = new ArrayList<Item>();
		fruits.add(new Item("Kiwi", 1.5));
		fruits.add(new Item("Mango", 2.0));
		fruits.add(new Item("Goji Berries", 4.0));
		fruits.add(new Item("Guava", .75));
		
		// Add fruits your view model here
		model.addAttribute("fruitsFromMyController", fruits);
		return "index.jsp";
	}

	public class Item {
		// MEMBER VARIABLES
		private String name;
		private double price;

		// CONSTRUCTOR
		public Item(String name, double price) {
			this.name = name;
			this.price = price;
		}
		// As always, don't forget to generate Getters and Setters!
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}
	}
}
