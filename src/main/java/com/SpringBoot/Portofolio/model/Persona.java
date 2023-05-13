
package com.SpringBoot.Portofolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
   private Long id;
   private String fotoPersona;
   private String urlInstagram;
   private String urlLinkedin;
   private String urlGithub;
   private String info;
}
