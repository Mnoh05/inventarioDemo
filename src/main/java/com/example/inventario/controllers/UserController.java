package com.example.inventario.controllers;

import com.example.inventario.models.UserModel;
import com.example.inventario.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/usuario")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public ArrayList<UserModel> getUsers(){return this.userService.getUsers();}

    @PostMapping
    public UserModel saveUser(@RequestBody UserModel user) {return this.userService.saveUser(user);}

}
