package com.example.demo.Service;


import com.example.demo.InterfaceService.IConsultaService;
import com.example.demo.Model.Consulta;
import com.example.demo.Repository.ConsultaRepository;
import com.example.demo.Repository.PropietarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConsultaService implements IConsultaService {

    @Autowired
    private ConsultaRepository repositorio;

    @Override
    public List<Consulta> listarConsultas() {
        return repositorio.findAll();
    }

    @Override
    public Consulta obtenerPorId(int id) {
        Optional<Consulta> consulta = repositorio.findById(id);
        return consulta.orElse(null);
    }

    @Override
    public void guardarConsulta(Consulta consulta) {
        repositorio.save(consulta);
    }

    @Override
    public void eliminarConsulta(int id) {
        repositorio.deleteById(id);
    }
}
