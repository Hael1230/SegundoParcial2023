package com.example.demoparcial2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoparcial2.entitis.Seleccion;
import com.example.demoparcial2.entitis.Continente;
import com.example.demoparcial2.repository.SeleccionRepository;
import com.example.demoparcial2.entitis.Resultado;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/selecciones")
public class SeleccionController{

    @Autowired
	SeleccionRepository seleccionRepository;

    @GetMapping
	public List<Seleccion> getSeleccionAll() {

		return seleccionRepository.findAll();
	}

    @GetMapping("/{nombre}/continente")
    public Continente getContinenteNombre(@PathVariable String nombre) {
		
		List<Seleccion> seleccion = seleccionRepository.findByNombre(nombre);
		
		if (!Seleccion.isEmpty()) {
			return seleccion.get(0).getContinente();
		}
		
		return null;

	}

    @PostMapping
	public Seleccion postSeleccion(@RequestBody Seleccion seleccion) {
		
		seleccionRepository.save(seleccion);
		
		return seleccion;
		

	}


}

