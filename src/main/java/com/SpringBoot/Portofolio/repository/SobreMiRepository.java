/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.SpringBoot.Portofolio.repository;

import com.SpringBoot.Portofolio.model.sobreMi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SobreMiRepository extends JpaRepository<sobreMi, Long>{
    
}
