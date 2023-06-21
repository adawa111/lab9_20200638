package com.example.lab9;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class InicioController {

    @GetMapping("/inicio")
    public String inicio(){
        return "inicio";
    }
}
