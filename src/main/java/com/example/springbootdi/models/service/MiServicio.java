package com.example.springbootdi.models.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class MiServicio {

    public String oepracion(){
        return "ejecutando algun proceso";
    }

}
