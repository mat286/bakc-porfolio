/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.SpringBoot.Portofolio.controller;

import com.SpringBoot.Portofolio.model.Proyectos;
import com.SpringBoot.Portofolio.service.IProyectoService;
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
@CrossOrigin(origins = "https://porfolio-784e6.web.app/proyectos")
public class ProyectoController {
    @Autowired
    private IProyectoService proProyecto;
    
        @GetMapping("/proyectos/traer")
    public List<Proyectos> getProyectos(){
        return proProyecto.getProyectos();
    }
    
    @GetMapping("/proyectos/{id}")
    public Proyectos findProyectos(@PathVariable Long id){
        return proProyecto.findProyectos(id);
    }
    
    @PostMapping("/proyectos/crear")
    public Proyectos createProyectos(@RequestBody Proyectos sobre){
        proProyecto.saveProyectos(sobre);
        return sobre;
    }
    
    @DeleteMapping("/proyectos/borrar/{id}")
    public String deleteProyectos (@PathVariable Long id){
        proProyecto.deleteProyectos(id);
        return "El Proyecto fue eliminada correctamente";
    }
    
    @PutMapping("/proyectos/editar/{id}")
    public Proyectos editProyectos(@PathVariable Long id,
                               @RequestBody Proyectos sobre){
          sobre.setId(id);
          proProyecto.saveProyectos(sobre);
          return sobre;
    }
}
