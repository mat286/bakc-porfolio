/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.SpringBoot.Portofolio.service;

import com.SpringBoot.Portofolio.model.Herramientas;
import com.SpringBoot.Portofolio.repository.HerramientasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HerramientasService implements IHerramientasService{

    @Autowired
    private HerramientasRepository herraRepository;
    @Override
    public List<Herramientas> getHerramientas() {
        List<Herramientas> listaHerramientas = herraRepository.findAll();
        return listaHerramientas;
    }

    @Override
    public void saveHerramientas(Herramientas expe) {
        herraRepository.save(expe);
    }

    @Override
    public void deleteHerramientas(Long id) {
        herraRepository.deleteById(id);
    }

    @Override
    public Herramientas findHerramientas(Long id) {
        Herramientas herra = herraRepository.findById(id).orElse(null);
        return herra;
    }
    
}
