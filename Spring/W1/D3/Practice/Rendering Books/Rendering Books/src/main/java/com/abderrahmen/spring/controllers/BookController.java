package com.abderrahmen.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.abderrahmen.spring.models.Book;
import com.abderrahmen.spring.services.BookService;

@Controller
public class BookController {

    @Autowired
    private BookService BookService;

    @GetMapping("/books/{id}")
    public String show(@PathVariable("id") Long id, Model model) {
        Book book = BookService.findBook(id);
        model.addAttribute("book", book);
        return "show.jsp";
    }

}