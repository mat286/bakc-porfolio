
package com.SpringBoot.Portofolio.service;

import com.SpringBoot.Portofolio.model.Educacion;
import java.util.List;


public interface IEducacionService {
    public List<Educacion> getEducacion();

    public void saveEducacion(Educacion cono);

    public void deleteEducacion(Long id);

    public Educacion findEducacion(Long id);
}
