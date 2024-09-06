package com.projeto1SpringBoot.projeto1.services;

import com.projeto1SpringBoot.projeto1.entities.Category;
import com.projeto1SpringBoot.projeto1.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }
    public Category findById(Long id) {
        Optional<Category> object = categoryRepository.findById(id);
        return object.get();
    }

}
