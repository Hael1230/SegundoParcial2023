package com.example.demoparcial2.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demoparcial2.entitis.Partido;

public interface PartidoRepository extends JpaRepository<Partido, Integer> {
    
}