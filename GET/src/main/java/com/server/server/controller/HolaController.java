package com.server.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {


    @GetMapping("/hola")
    public String hola(){

        return "Hola Mundo";
    }

    @GetMapping("/hola1")
    public String holaNombre(@RequestParam(name = "nombre")String nombre){

        return "Hola "+nombre;
    }

    @GetMapping("/hola2")
    public String holaNombreEdad(@RequestParam(name = "nombre")String nombre,
                             @RequestParam(name = "edad") int edad){

        return "Hola "+nombre+" tu edad es: "+edad;
    }

}
