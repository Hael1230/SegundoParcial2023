package com.example.demoparcial2.entitis;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Indexed;

import lombok.Data;

@Table(name="seleccion")
@Entity
@Data

public class Seleccion {
    @Id
    @SequenceGenerator(name="seleccion_id_seq", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seleccion_id_seq")

    private Integer id;
    private String nombre;
    private String grupo;

    @ManyToOne
    @JoinColumn(name="continente_id")
    private Continente continente;

    public static boolean isEmpty() {
        return false;
    }
}
