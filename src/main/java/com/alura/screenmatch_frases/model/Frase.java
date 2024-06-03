package com.alura.screenmatch_frases.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name = "frases")

public class Frase {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String titulo;
    private String frase;
    private String personagem;
    private String poster;

}
