package com.alura.screenmatch_frases.controller;

import com.alura.screenmatch_frases.dto.SerieDTO;
import com.alura.screenmatch_frases.services.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/series")
public class FraseController {

    @Autowired
    private FraseService service;

    @GetMapping("/frases")
    public SerieDTO obterFrasesAleatorias() {
        return service.obterFraseAleatoria();
    }
}
