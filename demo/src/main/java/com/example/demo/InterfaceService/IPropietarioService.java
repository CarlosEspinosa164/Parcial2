package com.example.demo.InterfaceService;


import com.example.demo.Model.Propietario;

import java.util.List;

public interface IPropietarioService {
    List<Propietario> listarPropietarios();
    Propietario obtenerPorId(int id);
    void guardarPropietario(Propietario propietario);
    void eliminarPropietario(int id);
}
