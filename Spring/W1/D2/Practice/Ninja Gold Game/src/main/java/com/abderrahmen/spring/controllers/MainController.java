package com.abderrahmen.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Controller
public class MainController {

    @RequestMapping("/")
    public String index(HttpSession session, Model model) {
        if (session.getAttribute("gold") == null) {
            session.setAttribute("gold", 0);
            session.setAttribute("activities", new ArrayList<String>());
        }
        model.addAttribute("gold", session.getAttribute("gold"));
        model.addAttribute("activities", session.getAttribute("activities"));
        return "index.jsp";
    }

    @RequestMapping(value = "/process", method = RequestMethod.POST)
    public String process(
            @RequestParam("place") String place,
            HttpSession session) {
        
        Random random = new Random();
        int gold = (int) session.getAttribute("gold");
        List<String> activities = (List<String>) session.getAttribute("activities");
        String activity = "";
        int goldEarnedOrLost = 0;
        
        switch (place) {
            case "farm":
                goldEarnedOrLost = random.nextInt(11) + 10;
                gold += goldEarnedOrLost;
                activity = "You entered a farm and earned " + goldEarnedOrLost + " gold. (" + new Date() + ")";
                break;
            case "cave":
                goldEarnedOrLost = random.nextInt(6) + 5;
                gold += goldEarnedOrLost;
                activity = "You entered a cave and earned " + goldEarnedOrLost + " gold. (" + new Date() + ")";
                break;
            case "house":
                goldEarnedOrLost = random.nextInt(4) + 2;
                gold += goldEarnedOrLost;
                activity = "You entered a house and earned " + goldEarnedOrLost + " gold. (" + new Date() + ")";
                break;
            case "quest":
                goldEarnedOrLost = random.nextInt(101) - 50;
                gold += goldEarnedOrLost;
                if (goldEarnedOrLost >= 0) {
                    activity = "You went on a quest and earned " + goldEarnedOrLost + " gold. (" + new Date() + ")";
                } else {
                    activity = "You went on a quest and lost " + (-goldEarnedOrLost) + " gold. (" + new Date() + ")";
                }
                break;
        }

        activities.add(0, activity);
        session.setAttribute("gold", gold);
        session.setAttribute("activities", activities);

        return "redirect:/";
    }
}
