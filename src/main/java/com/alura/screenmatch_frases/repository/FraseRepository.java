package com.alura.screenmatch_frases.repository;

import com.alura.screenmatch_frases.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.UUID;

public interface FraseRepository extends JpaRepository<Frase, UUID> {

    @Query("SELECT f FROM Frase f order by function('RANDOM') LIMIT 1")
    Frase obterFraseAleatoria();

}
