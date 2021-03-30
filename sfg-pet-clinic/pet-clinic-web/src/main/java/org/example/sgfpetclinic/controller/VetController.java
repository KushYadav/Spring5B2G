package org.example.sgfpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Create by Kush on 31-03-2021
 */
@Controller
public class VetController {

    @RequestMapping({"/vets","/vets/index","/vets/index.html"})
    public String listVets(){
        return "vets/index";
    }
}
