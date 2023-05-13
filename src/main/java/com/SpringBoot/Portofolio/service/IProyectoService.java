
package com.SpringBoot.Portofolio.service;

import com.SpringBoot.Portofolio.model.Proyectos;
import java.util.List;


public interface IProyectoService {
        public List<Proyectos> getProyectos();

    public void saveProyectos(Proyectos expe);

    public void deleteProyectos(Long id);

    public Proyectos findProyectos(Long id);
}
