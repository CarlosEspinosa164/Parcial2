package com.example.demo.InterfaceService;

import com.example.demo.Model.Mascota;

import java.util.List;

public interface IMascotasService {

    List<Mascota> listar();

    void guardar(Mascota clases);


}
