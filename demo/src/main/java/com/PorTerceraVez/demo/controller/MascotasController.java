package com.PorTerceraVez.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/mascotas")

public class MascotasController {

    @GetMapping
    public String algo() {
        return "Ahora sí";
    }
    
}
