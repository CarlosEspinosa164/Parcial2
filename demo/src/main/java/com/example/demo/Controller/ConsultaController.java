package com.example.demo.Controller;


import com.example.demo.InterfaceService.IConsultaService;
import com.example.demo.InterfaceService.IMascotaService;
import com.example.demo.InterfaceService.IVeterinarioService;
import com.example.demo.Model.Consulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/consultas")
public class ConsultaController {

    @Autowired
    private IMascotaService MascotaService;

    @Autowired
    private IVeterinarioService VeterinarioService;

    @Autowired
    private IConsultaService service;

    @GetMapping
    public String listarConsultas(Model model) {
        model.addAttribute("consultas", service.listarConsultas());
        return "historia-clinica";
    }

    @GetMapping("/nueva/{mascota_id}")
    public String nuevaConsulta(@PathVariable("mascota_id") int mascota_id, Model model) {
        model.addAttribute("mascota", MascotaService.obtenerPorId(mascota_id));
        model.addAttribute("veterinarios", VeterinarioService.listarVeterinarios());
        model.addAttribute("consulta", new Consulta()); // Añade esta línea para inicializar
        return "nueva-consulta";
    }



    @PostMapping("/guardar")
    public String guardarConsulta(Consulta consulta) {
        service.guardarConsulta(consulta);
        return "redirect:/consultas";
    }
}
