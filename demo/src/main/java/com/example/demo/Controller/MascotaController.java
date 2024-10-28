package com.example.demo.Controller;

import com.example.demo.InterfaceService.IMascotaService;
import com.example.demo.InterfaceService.IPropietarioService;
import com.example.demo.InterfaceService.IVeterinarioService;
import com.example.demo.Model.Mascota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/mascotas") // Cambié esto para que esté más claro
public class MascotaController {

    @Autowired
    private IMascotaService service;
    @Autowired
    private IPropietarioService PropietarioService;

    @GetMapping
    public String listarMascotas(Model model) {
        model.addAttribute("mascotas", service.listar());
        return "propietarios";
    }

    @GetMapping("/nueva")
    public String nuevaMascota( Model model) {
        model.addAttribute("mascota", new Mascota());
        model.addAttribute("propietario", PropietarioService.listarPropietarios() );
        return "nueva-mascota";
    }

    @PostMapping("/agregar")
    public String agregarMascota(Mascota mascota) {
        service.guardar(mascota);
        return "redirect:/propietarios";
    }
}

