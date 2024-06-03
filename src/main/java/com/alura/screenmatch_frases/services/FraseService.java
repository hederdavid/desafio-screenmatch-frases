package com.alura.screenmatch_frases.services;

import com.alura.screenmatch_frases.dto.SerieDTO;
import com.alura.screenmatch_frases.model.Frase;
import com.alura.screenmatch_frases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repository;

    public SerieDTO obterFraseAleatoria() {
        Frase frase = repository.obterFraseAleatoria();
        return new SerieDTO(frase.getId(), frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }
}
