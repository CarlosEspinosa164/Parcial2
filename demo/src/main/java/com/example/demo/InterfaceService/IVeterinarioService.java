package com.example.demo.InterfaceService;


import com.example.demo.Model.Veterinario;

import java.util.List;

public interface IVeterinarioService {
    List<Veterinario> listarVeterinarios();
    Veterinario obtenerPorId(int id);
    void guardarVeterinario(Veterinario veterinario);
    void eliminarVeterinario(int id);
}
