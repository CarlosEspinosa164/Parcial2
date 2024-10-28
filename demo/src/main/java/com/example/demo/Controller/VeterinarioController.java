package com.example.demo.Controller;


import com.example.demo.InterfaceService.IVeterinarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping
public class VeterinarioController {
    @Autowired
    private IVeterinarioService service;

    @GetMapping("/veterinarios")
    public String listarVeterinarios(Model model) {
        model.addAttribute("veterinarios", service.listarVeterinarios());
        return "veterinarios";
    }
}
