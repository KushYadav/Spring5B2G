package org.example.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Create by Kush on 31-03-2021
 */
@RequestMapping("/vets")
@Controller
public class VetController {

    @RequestMapping({"","/","/index","/index.html"})
    public String listVets(){
        return "vets/index";
    }
}
