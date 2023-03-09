/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examen1.controller;

import com.examen1.entity.boletos;
import com.examen1.entity.Lugar;
import com.examen1.service.BoletoService;
import com.examen1.service.IBoletoService;
import com.examen1.service.ILugarService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Marcelo
 */
@Controller
public class BoletoController {

    @Autowired
    private IBoletoService boletoService;

    @Autowired
    private ILugarService lugarService;

    @GetMapping("/boleto")
    public String index(Model model) {
        List<boletos> listaConcierto = boletoService.getAllBoleto();
        model.addAttribute("tituloVisualizacion", "Acá puedes visualizar las peliculas");
        model.addAttribute("tituloPeliculas", "Próximos estrenos");
        model.addAttribute("boleto", listaConcierto);
        return "boleto";
    }

    @GetMapping("/boletoN")
    public String crearBoleto(Model model) {
        List<Lugar> listaLugar = lugarService.listLugar();
        model.addAttribute("boleto", new boletos());
        model.addAttribute("lugar", listaLugar);
        return "crear";
    }

    @GetMapping("/CrearBoleto")
    public String nuevoBoleto(boletos boleto) {
        return "modificarBoleto";
    }

    @PostMapping("/GuardarBoleto")
    public String GuardarBoleto(boletos boleto) {
       boletoService.saveboleto(boleto);
        return "redirect:/";
    }

    @GetMapping("/editBoleto/{id}")
    public String modificarBoleto(boletos boleto, Model model) {
        boleto = boletoService.getBoleto(boleto);
        model.addAttribute("Boleto", boleto);
        return "modificarBoleto";
    }

    @GetMapping("/delete/{id}")
    public String delete(boletos boleto, Model model) {
        boletoService.delete(boleto);
        return "redirect:/";
    }
}
 