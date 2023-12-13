package com.example.inventario.controllers;

import com.example.inventario.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UserController {
    @Autowired
    private UserService userService;



}
