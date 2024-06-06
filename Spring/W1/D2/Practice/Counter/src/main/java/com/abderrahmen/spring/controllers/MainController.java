package com.abderrahmen.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {

	@RequestMapping("/your_server")
	public String firstPage(HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		} else {
			int count = (int) session.getAttribute("count");
			session.setAttribute("count", count + 1);
		}
		return "index.jsp";
	}

	@RequestMapping("/your_server/counter")
	public String secondPage(HttpSession session) {
		int count = (int) session.getAttribute("count");
		session.setAttribute("count", count + 1);
		System.out.println("Hello again! Visit count: " + (count + 1));
		return "welcome.jsp";
	}

}
