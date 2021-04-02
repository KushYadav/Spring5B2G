package org.example.sfgpetclinic.controller;

import org.example.sfgpetclinic.service.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Create by Kush on 31-03-2021
 */
@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets.html","/vets","/vets/index","/vets/index.html"})
    public String listVets(Model model){
        model.addAttribute("vets",vetService.findAll());
        return "vets/index";
    }
}
