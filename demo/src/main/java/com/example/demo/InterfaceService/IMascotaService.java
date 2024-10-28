package com.example.demo.InterfaceService;

import com.example.demo.Model.Mascota;

import java.util.List;

public interface IMascotaService {
    List<Mascota> listar();
    Mascota guardar(Mascota mascota);
    Mascota obtenerPorId(int id);

}

