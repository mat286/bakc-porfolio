/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.SpringBoot.Portofolio.service;

import com.SpringBoot.Portofolio.model.Proyectos;
import com.SpringBoot.Portofolio.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService{

    @Autowired
    private ProyectoRepository proyeRepository;
     
    @Override
    public List<Proyectos> getProyectos() {
        List<Proyectos> listaProyectos = proyeRepository.findAll();
        return listaProyectos;
    }

    @Override
    public void saveProyectos(Proyectos proye) {
        proyeRepository.save(proye);
    }

    @Override
    public void deleteProyectos(Long id) {
        proyeRepository.deleteById(id);
    }

    @Override
    public Proyectos findProyectos(Long id) {
        Proyectos edu = proyeRepository.findById(id).orElse(null);
        return edu;
    }
    
}
