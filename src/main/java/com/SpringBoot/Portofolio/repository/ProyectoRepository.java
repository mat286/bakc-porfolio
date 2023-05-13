
package com.SpringBoot.Portofolio.repository;

import com.SpringBoot.Portofolio.model.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProyectoRepository extends JpaRepository<Proyectos, Long>{
    
}
