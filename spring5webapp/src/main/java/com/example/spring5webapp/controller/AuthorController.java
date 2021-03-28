package com.example.spring5webapp.controller;

import com.example.spring5webapp.repository.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Create by Kush on 26-03-2021
 */

@Controller
public class AuthorController {

    AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("authors")
    public String getAuthors(Model model) {

        model.addAttribute("authors",authorRepository.findAll());
        return "authors/list";

    }
}
