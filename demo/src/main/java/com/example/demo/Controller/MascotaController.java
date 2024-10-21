package com.example.demo.Controller;

import com.example.demo.InterfaceService.IMascotasService;
import com.example.demo.Model.Mascota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class MascotaController {

    @Autowired
    private IMascotasService service;

    @GetMapping("/listar")
    public String listarmascotas(Model model) {
        model.addAttribute("titulo", "Spring DB");
        model.addAttribute("cuerpo", "LISTA DE Mascotas");
        model.addAttribute("datos", service.listar());
        return "index";
    }

    @GetMapping("/nuevo")
    public String formAgregarEstufiantes(Model model){

        model.addAttribute("titulo", "Nuevo");
        model.addAttribute("cuerpo", "USUARIO NUEVO");

        model.addAttribute("estu",new Mascota());
        return "nuevo";
    }

    @PostMapping("/guardar")
    public String guardarEstudiante(@ModelAttribute Mascota est){

        service.guardar(est);

        return "redirect:/listar";
    }





}
