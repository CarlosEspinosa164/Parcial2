package com.example.demo.Controller;

import com.example.demo.InterfaceService.IPropietarioService;
import com.example.demo.Model.Propietario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class PropietarioController {

    @Autowired
    private IPropietarioService service;

    @GetMapping("/propietarios")
    public String listarPropietarios(Model model) {
        model.addAttribute("propietarios",service.listarPropietarios() );
        return "propietarios";
    }

    @GetMapping("/propietarios/nuevo")
    public String nuevoPropietario() {
        return "nuevo-propietario";
    }

    @PostMapping("/propietarios/guardar")
    public String guardarPropietario(Propietario propietario) {
        service.guardarPropietario(propietario);
        return "redirect:/propietarios";
    }
}
