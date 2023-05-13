/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.SpringBoot.Portofolio.service;

import com.SpringBoot.Portofolio.model.User;
import com.SpringBoot.Portofolio.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getUser() {
        List<User> listaProyectos = userRepository.findAll();
        return listaProyectos;
    }

    @Override
    public void saveUser(User use) {
        userRepository.save(use);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User findUser(Long id) {
        User edu = userRepository.findById(id).orElse(null);
        return edu;
    }

    @Override
    public User validarUser(User user, List<User> listaUsuarios) {
        User usuarioDevolver = null;
        for (User usuario : listaUsuarios) {
            if (user.getNombre().equals(usuario.getNombre())) {
                if (user.getContrasena().equals(usuario.getContrasena())) {
                    if (usuario.getAdmin()) {
                        usuarioDevolver = usuario;
                        usuarioDevolver.setContrasena("");
                        usuarioDevolver.setNombre("");

                    }
                }
            }
        }
        return usuarioDevolver;
    }

}
