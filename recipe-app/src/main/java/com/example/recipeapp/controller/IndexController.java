package com.example.recipeapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Create by Kush on 01-04-2021
 */
@Controller
public class IndexController {

    @RequestMapping({"","/","/index","index.html"})
    public String getIndexPage(Model model){
        System.out.println("123");
        return "index";
    }
}
