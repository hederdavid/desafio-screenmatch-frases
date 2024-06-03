package com.alura.screenmatch_frases.dto;

import java.util.UUID;

public record SerieDTO(UUID id,
                       String titulo,
                       String frase,
                       String personagem,
                       String poster) {
}
