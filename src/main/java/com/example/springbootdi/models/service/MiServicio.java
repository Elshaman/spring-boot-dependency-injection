package com.example.springbootdi.models.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("miServicioSimple")
public class MiServicio  implements IServicio{

    @Override
    public String oepracion(){
        return "ejecutando algun proceso";
    }

}
