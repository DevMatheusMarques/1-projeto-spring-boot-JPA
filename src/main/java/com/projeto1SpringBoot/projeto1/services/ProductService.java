package com.projeto1SpringBoot.projeto1.services;

import com.projeto1SpringBoot.projeto1.entities.Product;
import com.projeto1SpringBoot.projeto1.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }
    public Product findById(Long id) {
        Optional<Product> object = productRepository.findById(id);
        return object.get();
    }

}
