package com.example.demoparcial2.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demoparcial2.entitis.Seleccion;

public interface SeleccionRepository extends JpaRepository<Seleccion, Integer> {

    List<Seleccion> findByNombre(String nombre);

    Optional<Seleccion> findByGrupo(String grupo);
    
}