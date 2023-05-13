
package com.SpringBoot.Portofolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Proyectos {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String puesto;
    private String url;
    private String img;
    private String fecha;
    private String info;
    
    /*@OneToMany( mappedBy= "proyecto" )
    Set herramientas;*/
}
