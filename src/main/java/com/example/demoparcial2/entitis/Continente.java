package com.example.demoparcial2.entitis;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Indexed;

import lombok.Data;

@Table(name="continente")
@Entity
@Data

public class Continente {
    @Id 
    @SequenceGenerator(name="continente_id_seq", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="continente_id_seq")
    private Integer id;
    private String nombre;
}
