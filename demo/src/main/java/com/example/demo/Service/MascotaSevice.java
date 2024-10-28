package com.example.demo.Service;

import com.example.demo.InterfaceService.IMascotaService;
import com.example.demo.Model.Consulta;
import com.example.demo.Model.Mascota;
import com.example.demo.Repository.MascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MascotaSevice implements IMascotaService {


    @Autowired
    private MascotaRepository repositorio;


    @Override
    public List<Mascota> listar() {
        return repositorio.findAll();
    }

    @Override
    public Mascota guardar(Mascota mascota) {
        return repositorio.save(mascota);
    }
    @Override
    public Mascota obtenerPorId(int id) {
        Optional<Mascota> consulta = repositorio.findById(id);
        return consulta.orElse(null);
    }
}
