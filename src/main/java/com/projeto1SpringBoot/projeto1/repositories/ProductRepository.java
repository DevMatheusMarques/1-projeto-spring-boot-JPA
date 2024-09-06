package com.projeto1SpringBoot.projeto1.repositories;

import com.projeto1SpringBoot.projeto1.entities.Category;
import com.projeto1SpringBoot.projeto1.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>{
}