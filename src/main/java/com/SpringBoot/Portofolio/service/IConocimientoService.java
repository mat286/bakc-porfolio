/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.SpringBoot.Portofolio.service;

import com.SpringBoot.Portofolio.model.Conocimiento;
import java.util.List;


public interface IConocimientoService {
    public List<Conocimiento> getConocimiento();

    public void saveConocimiento(Conocimiento cono);

    public void deleteConocimiento(Long id);

    public Conocimiento findConocimiento(Long id);
}
