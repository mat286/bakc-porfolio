
package com.SpringBoot.Portofolio.service;

import com.SpringBoot.Portofolio.model.Herramientas;
import java.util.List;


public interface IHerramientasService {
    public List<Herramientas> getHerramientas();

    public void saveHerramientas(Herramientas expe);

    public void deleteHerramientas(Long id);

    public Herramientas findHerramientas(Long id);
}
