package com.example.springbootdi.controllers;

import com.example.springbootdi.models.service.MiServicio;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    private MiServicio miServicio = new MiServicio();

    @GetMapping({"/index" , "", "/"})
    public String index(Model model){
        model.addAttribute("objeto" , miServicio.oepracion());
        return "index";
    }


}
