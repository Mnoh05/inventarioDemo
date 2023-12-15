package com.example.inventario.controllers;

import com.example.inventario.models.ProductModel;
import com.example.inventario.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;


@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public ArrayList<ProductModel> getProducts() { return  this.productService.getProducts();}

    @PostMapping
    public ProductModel saveProduct(@RequestBody ProductModel product) {return this.productService.saveProduct(product);}

    @GetMapping(path = "/{id}")
    public Optional<ProductModel> getProductByID(@PathVariable Long id) {return this.productService.getById(id);}

    @PutMapping(path = "/{id}")
    public ProductModel updateProductById(@RequestBody ProductModel request, @PathVariable Long id){
    return this.productService.updateById(request, id);
    }

    @DeleteMapping(path = "{id}")
     public String deleteById(@PathVariable("id") Long id) {
        boolean ok = this.productService.deleteProduct(id);
        if (ok) {
            return "User con id " + id + "eliminado";
        } else {
            return "Error no se pudo eliminar el " + id;
        }
    }
}

