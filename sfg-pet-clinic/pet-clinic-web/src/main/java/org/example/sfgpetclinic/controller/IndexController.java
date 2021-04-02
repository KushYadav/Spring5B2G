package org.example.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Create by Kush on 31-03-2021
 */
@Controller
public class IndexController {

    @RequestMapping({"","/","index","index.html"})
    public String index(){
        return "index";
    }

    @RequestMapping({"/oups"})
    public String oupsHandler(){
        return "notImplementedYet";
    }
}
