package com.example.demo.Service;

import com.example.demo.InterfaceService.IMascotasService;
import com.example.demo.Model.Mascota;
import com.example.demo.Repository.RMascota;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MascotaSevice implements IMascotasService {


    @Autowired
    private RMascota repositorio;


    @Override
    public List<Mascota> listar() {
        return repositorio.findAll();
    }

    @Override
    public void guardar(Mascota est) {
        repositorio.save(est);
    }
}
