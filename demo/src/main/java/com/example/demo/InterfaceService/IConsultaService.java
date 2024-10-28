package com.example.demo.InterfaceService;


import com.example.demo.Model.Consulta;

import java.util.List;

public interface IConsultaService {
    List<Consulta> listarConsultas();
    Consulta obtenerPorId(int id);
    void guardarConsulta(Consulta consulta);
    void eliminarConsulta(int id);
}
