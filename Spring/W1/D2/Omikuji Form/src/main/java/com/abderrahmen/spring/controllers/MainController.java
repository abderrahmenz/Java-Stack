package com.abderrahmen.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {

    @RequestMapping("/omikuji")
    public String index() {
        return "index.jsp";
    }

    @RequestMapping("/omikuji/process")
    public String process(
        @RequestParam(value="number") int number,
        @RequestParam(value="city") String city,
        @RequestParam(value="name") String name,
        @RequestParam(value="endeavorOrHobby") String endeavorOrHobby,
        @RequestParam(value="livingThing") String livingThing, HttpSession session) {
            session.setAttribute("number", number);
            session.setAttribute("city", city);
            session.setAttribute("name", name);
            session.setAttribute("endeavorOrHobby", endeavorOrHobby);
            session.setAttribute("livingThing", livingThing);
            System.out.println("Number in session: " + session.getAttribute("number"));
            return "redirect:/omikuji/show";
    }

    @RequestMapping("/omikuji/show")
    public String show() {
        return "welcome.jsp";
    }
}
