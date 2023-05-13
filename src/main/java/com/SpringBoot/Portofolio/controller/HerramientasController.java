/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.SpringBoot.Portofolio.controller;

import com.SpringBoot.Portofolio.model.Herramientas;
import com.SpringBoot.Portofolio.service.IHerramientasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200/herramientas")
public class HerramientasController {
    
    @Autowired
    private IHerramientasService herraHerramientas;
    
    @GetMapping("/herramientas/traer")
    public List<Herramientas> getHerramientas() {
        return herraHerramientas.getHerramientas();
    }
    
    @GetMapping("/herramientas/{id}")
    public Herramientas findHerramientas(@PathVariable Long id) {
        return herraHerramientas.findHerramientas(id);
    }
    
    @PostMapping("/herramientas/crear")
    public String createHerramientas(@RequestBody Herramientas edu) {
        herraHerramientas.saveHerramientas(edu);
        return "la Herramienta fue creada correctamente";
    }
    @DeleteMapping("/herramientas/borrar/{id}")
    public String deleteHerramientas(@PathVariable Long id) {
        herraHerramientas.deleteHerramientas(id);
        return "La Herramienta fue eliminada correctamente";
    }
    
    @PutMapping("/herramientas/editar/{id}")
    public Herramientas editHerramientas(@PathVariable Long id,
            @RequestBody Herramientas cono) {
        cono.setId(id);
        herraHerramientas.saveHerramientas(cono);
        return cono;
    }
}
