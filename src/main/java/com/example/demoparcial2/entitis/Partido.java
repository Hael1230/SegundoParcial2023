package com.example.demoparcial2.entitis;

import java.security.Timestamp;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Indexed;

import lombok.Data;

@Table(name="partido")
@Entity
@Data

public class Partido {
    @Id
    @SequenceGenerator(name="partido_id_seq", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="partido_id_seq")

    private Integer id;
    private Timestamp fecha;

    @ManyToMany
    @JoinColumn(name="estadio_id")
    private Estadio estadio;

}
