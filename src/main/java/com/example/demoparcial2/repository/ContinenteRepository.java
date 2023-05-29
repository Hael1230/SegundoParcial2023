package com.example.demoparcial2.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demoparcial2.entitis.Continente;

public interface ContinenteRepository extends JpaRepository<Continente, Integer> {
    public List<Continente> findByNombre(String nombre);
}
