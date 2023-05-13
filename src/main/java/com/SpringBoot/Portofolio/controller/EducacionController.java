
package com.SpringBoot.Portofolio.controller;

import com.SpringBoot.Portofolio.model.Educacion;
import com.SpringBoot.Portofolio.service.IEducacionService;
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
@CrossOrigin(origins = "http://localhost:4200/Educacion")
public class EducacionController {
    
    @Autowired
    private IEducacionService eduEducacion;
    
    @GetMapping("/Educaciones/traer")
    public List<Educacion> getEducacion() {
        return eduEducacion.getEducacion();
    }
    
    @GetMapping("/Educaciones/{id}")
    public Educacion findEducacion(@PathVariable Long id) {
        return eduEducacion.findEducacion(id);
    }
    
    @PostMapping("/Educaciones/crear")
    public String createEducacion(@RequestBody Educacion edu) {
        eduEducacion.saveEducacion(edu);
        return "la educacion fue creada correctamente";
    }
    @DeleteMapping("/Educaciones/borrar/{id}")
    public String deleteEducacion(@PathVariable Long id) {
        eduEducacion.deleteEducacion(id);
        return "La educacion fue eliminada correctamente";
    }
    
    @PutMapping("/Educaciones/editar/{id}")
    public Educacion editEducacion(@PathVariable Long id,
            @RequestBody Educacion cono) {
        cono.setId(id);
        eduEducacion.saveEducacion(cono);
        return cono;
    }
}
