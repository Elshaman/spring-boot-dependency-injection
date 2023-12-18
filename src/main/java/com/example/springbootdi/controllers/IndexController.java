package com.example.springbootdi.controllers;

import com.example.springbootdi.models.service.MiServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Autowired
    private MiServicio miServicio;

    @GetMapping({"/index" , "", "/"})
    public String index(Model model){
        model.addAttribute("objeto" , miServicio.oepracion());
        return "index";
    }


}
