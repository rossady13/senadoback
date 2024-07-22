package com.iudigital.Senado.Entidades;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity

public class Senador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombres;
    private String departamento;

    @ManyToOne
    @JoinColumn(name = "partido_id")
    private Partido partido;
}
