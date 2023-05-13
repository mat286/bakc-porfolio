
package com.SpringBoot.Portofolio.service;

import com.SpringBoot.Portofolio.model.Conocimiento;
import com.SpringBoot.Portofolio.repository.ConocimientoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ConocimientoService implements IConocimientoService {
    
    @Autowired
    private ConocimientoRepository conoRepository;

    @Override
    public List<Conocimiento> getConocimiento() {
        List<Conocimiento> listaConocimiento = conoRepository.findAll();
        return listaConocimiento;
    }

    @Override
    public void saveConocimiento(Conocimiento cono) {
        conoRepository.save(cono);
    }

    @Override
    public void deleteConocimiento(Long id) {
        conoRepository.deleteById(id);
    }

    @Override
    public Conocimiento findConocimiento(Long id) {
        Conocimiento cono = conoRepository.findById(id).orElse(null);
        return cono;
    }
    
}
