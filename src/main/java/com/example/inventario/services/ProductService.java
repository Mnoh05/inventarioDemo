package com.example.inventario.services;

import com.example.inventario.models.ProductModel;
import com.example.inventario.repositories.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;
@Service
public class ProductService {

    @Autowired
    IProductRepository productRepository;

    public ArrayList<ProductModel> getProducts(){
            return (ArrayList<ProductModel>) productRepository.findAll();
    }
    public ProductModel saveProduct(ProductModel product){return productRepository.save(product);}

    public Optional<ProductModel> getById(Long id) {return productRepository.findById(id);}

    public ProductModel updateById(ProductModel request, Long id){
        ProductModel productModel = productRepository.findById(id).get();
        productModel.setName(request.getName());
        productModel.setDescripcion(request.getDescripcion());
        productModel.setCantidad(request.getCantidad());
        productModel.setPrecio(request.getPrecio());
        productModel.setCodigoBarra(request.getCodigoBarra());
        productRepository.save(productModel);
        return productModel;
    }

    public Boolean deleteProduct(Long id){
        try {
            productRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
