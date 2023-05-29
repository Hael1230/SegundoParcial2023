package com.example.demoparcial2.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demoparcial2.entitis.Continente;
import com.example.demoparcial2.entitis.Estadio;

public interface EstadioRepository extends JpaRepository<Estadio, Integer>{
    
}
