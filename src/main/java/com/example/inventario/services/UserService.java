package com.example.inventario.services;

import com.example.inventario.models.UserModel;
import com.example.inventario.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {
    @Autowired
    IUserRepository userRepository;

    public ArrayList <UserModel> getUsers(){
        return(ArrayList<UserModel> )userRepository.findAll();
    }
}
