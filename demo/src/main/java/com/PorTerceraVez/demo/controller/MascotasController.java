package com.PorTerceraVez.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.annotation.Resource;

@Resource
@RequestMapping("/api/mascotas")

public class MascotasController {

    @GetMapping
    public String algo() {
        return "Ahora sí";
    }
    
}
