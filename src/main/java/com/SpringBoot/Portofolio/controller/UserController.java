/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.SpringBoot.Portofolio.controller;

import com.SpringBoot.Portofolio.model.User;
import com.SpringBoot.Portofolio.service.IUserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://porfolio-784e6.web.app")
public class UserController {
    @Autowired
    private IUserService interUser;
    
    @GetMapping("/user/traer")
    public List<User> getUser(){
        return interUser.getUser();
    }
    
    @GetMapping("/user/{id}")
    public User findUser(@PathVariable Long id){
        return interUser.findUser(id);
    }
    
    @PostMapping("/user/crear")
    public String createPersona(@RequestBody User perso){
        interUser.saveUser(perso);
        return "La persona fue creada correctamente";
    }
    
    @DeleteMapping("/user/borrar/{id}")
    public String deletePersona (@PathVariable Long id){
        interUser.deleteUser(id);
        return "La persona fue eliminada correctamente";
    }
    
    @PutMapping("/user/editar/{id}")
    public User editPersona(@PathVariable Long id,
                               @RequestBody User perso){
          perso.setId(id);
          interUser.saveUser(perso);
          return perso;
    }
    
    @PostMapping("/user/login")
    public User validarUser(@RequestBody User user) {
        User usuarioDevolver = null;
        List<User> listaUsuarios = this.getUser();
        usuarioDevolver = interUser.validarUser(user, listaUsuarios);
       
        return usuarioDevolver;
    }
    
}
