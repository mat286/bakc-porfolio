/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.SpringBoot.Portofolio.service;


import com.SpringBoot.Portofolio.model.User;
import java.util.List;

/**
 *
 * @author ONPAdmin
 */
public interface IUserService {

    public List<User> getUser();

    public void saveUser(User use);

    public void deleteUser(Long id);

    public User findUser(Long id);
    
    public User validarUser(User use, List<User>lista);
}
