package com.example.inventario.repositories;

import com.example.inventario.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository <UserModel, Long> {
}
