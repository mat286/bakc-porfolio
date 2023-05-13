/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.SpringBoot.Portofolio.service;

import com.SpringBoot.Portofolio.model.sobreMi;
import java.util.List;


public interface ISobreMiService {
    
    public List<sobreMi> getSobreMi(); 
   
   public void saveSobreMi (sobreMi sobre); 
   
   public void deleteSobreMi(Long id); 
   
   public sobreMi findSobreMi(Long id);
}
