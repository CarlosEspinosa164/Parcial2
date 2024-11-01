package com.example.demo.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "propietario")
public class Propietario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    private String nombre;

    private String direccion;

    private String telefono;

    @OneToMany(mappedBy = "propietario")
    private List<Mascota> mascotas;


}
