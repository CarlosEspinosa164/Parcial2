package com.example.demo.Service;


import com.example.demo.InterfaceService.IPropietarioService;
import com.example.demo.Model.Propietario;
import com.example.demo.Repository.MascotaRepository;
import com.example.demo.Repository.PropietarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PropietarioService implements IPropietarioService {


    @Autowired
    private PropietarioRepository repositorio;


    @Override
    public List<Propietario> listarPropietarios() {
        return repositorio.findAll();
    }

    @Override
    public Propietario obtenerPorId(int id) {
        Optional<Propietario> propietario = repositorio.findById(id);
        return propietario.orElse(null);
    }

    @Override
    public void guardarPropietario(Propietario propietario) {
        repositorio.save(propietario);
    }

    @Override
    public void eliminarPropietario(int id) {
        repositorio.deleteById(id);
    }
}