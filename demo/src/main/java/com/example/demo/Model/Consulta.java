package com.example.demo.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
@Entity
@Table(name = "consulta")
public class Consulta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    private LocalDate fecha_consulta;

    private String motivo;

    private String diagnostico;

    @ManyToOne
    @JoinColumn(name = "mascota_id", referencedColumnName = "Id")
    private Mascota mascota;

    @ManyToOne
    @JoinColumn(name = "veterinario_id", referencedColumnName = "Id")
    private Veterinario veterinario;



}
