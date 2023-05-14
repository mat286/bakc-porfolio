
package com.SpringBoot.Portofolio.controller;

import com.SpringBoot.Portofolio.model.Conocimiento;
import com.SpringBoot.Portofolio.service.IConocimientoService;
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
@CrossOrigin(origins = "https://porfolio-784e6.web.app/Conocimientos")
public class ConocimientoController {
    
    @Autowired
    private IConocimientoService conoConocimiento;
    
    @GetMapping("/Conocimientos/traer")
    public List<Conocimiento> getConocimiento() {
        return conoConocimiento.getConocimiento();
    }
    
    @GetMapping("/Conocimientos/{id}")
    public Conocimiento findConocimiento(@PathVariable Long id) {
        return conoConocimiento.findConocimiento(id);
    }
    
    @PostMapping("/Conocimientos/crear")
    public String createConocimiento(@RequestBody Conocimiento cono) {
        conoConocimiento.saveConocimiento(cono);
        return "El Conocimiento fue creada correctamente";
    }
    @DeleteMapping("/Conocimientos/borrar/{id}")
    public String deleteConocimiento(@PathVariable Long id) {
        conoConocimiento.deleteConocimiento(id);
        return "El Conocimiento fue eliminada correctamente";
    }
    
    @PutMapping("/Conocimientos/editar/{id}")
    public Conocimiento editConocimiento(@PathVariable Long id,
            @RequestBody Conocimiento cono) {
        cono.setId(id);
        conoConocimiento.saveConocimiento(cono);
        return cono;
    }
}
