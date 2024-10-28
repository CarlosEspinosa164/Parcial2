package com.example.demo.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "mascota")
public class Mascota {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int Id;

        private String nombre;

        private String especie;

        private String raza;

        private LocalDate fecha_nacimiento;

        @ManyToOne
        @JoinColumn(name = "propietario_id", referencedColumnName = "Id")
        private Propietario propietario;

        @OneToMany(mappedBy = "mascota")
        private List<Consulta> consulta;
}

