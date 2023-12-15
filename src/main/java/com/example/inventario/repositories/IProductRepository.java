package com.example.inventario.repositories;

import com.example.inventario.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<ProductModel, Long> {
}
