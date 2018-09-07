package com.server.server.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {


    @PostMapping("/usuario")
    public String usuario(@RequestBody Usuario usuario){

        return "Hola "+usuario.getNombre() +" "+usuario.getApellido();
    }

}
