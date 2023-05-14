
package com.SpringBoot.Portofolio.controller;

import com.SpringBoot.Portofolio.model.sobreMi;
import com.SpringBoot.Portofolio.service.ISobreMiService;
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
@CrossOrigin(origins = "https://porfolio-784e6.web.app")
public class SobreMiController {
   @Autowired
    private ISobreMiService interPersona;
    
        @GetMapping("/sobremi/traer")
    public List<sobreMi> getSobreMi(){
        return interPersona.getSobreMi();
    }
    
    @GetMapping("/sobremi/{id}")
    public sobreMi findSobreMi(@PathVariable Long id){
        return interPersona.findSobreMi(id);
    }
    
    @PostMapping("/sobremi/crear")
    public String createSobreMi(@RequestBody sobreMi sobre){
        interPersona.saveSobreMi(sobre);
        return "La persona fue creada correctamente";
    }
    
    @DeleteMapping("/sobremi/borrar/{id}")
    public String deleteSobreMi (@PathVariable Long id){
        interPersona.deleteSobreMi(id);
        return "La persona fue eliminada correctamente";
    }
    
    @PutMapping("/sobremi/editar/{id}")
    public sobreMi editSobreMi(@PathVariable Long id,
                               @RequestBody sobreMi sobre){
          sobre.setId(id);
          interPersona.saveSobreMi(sobre);
          return sobre;
    }
}