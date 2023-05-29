package com.example.demoparcial2.entitis;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Indexed;

import lombok.Data;

@Table(name="resultado")
@Entity
@Data

public class Resultado {
    @Id
    @SequenceGenerator(name="resultado_id_seq", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="resultado_id_seq")

    private Integer id;
    private Integer goles;
    private Integer amarillas;
    private Integer rojas;

    @OneToMany 
    @JoinColumn(name="partido_id")
    private Partido partido;
    @ManyToMany
    @JoinColumn(name="seleccion_id")
    private Seleccion seleccion;
}
