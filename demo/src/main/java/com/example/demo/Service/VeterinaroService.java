package com.example.demo.Service;

import com.example.demo.InterfaceService.IVeterinarioService;
import com.example.demo.Model.Veterinario;
import com.example.demo.Repository.PropietarioRepository;
import com.example.demo.Repository.VeterinarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VeterinaroService implements IVeterinarioService {

    @Autowired
    private VeterinarioRepository repositorio;

    @Override
    public List<Veterinario> listarVeterinarios() {
        return repositorio.findAll();
    }

    @Override
    public Veterinario obtenerPorId(int id) {
        Optional<Veterinario> veterinario = repositorio.findById(id);
        return veterinario.orElse(null);
    }

    @Override
    public void guardarVeterinario(Veterinario veterinario) {
        repositorio.save(veterinario);
    }

    @Override
    public void eliminarVeterinario(int id) {
        repositorio.deleteById(id);
    }


}
