package com.projeto1SpringBoot.projeto1.repositories;

import com.projeto1SpringBoot.projeto1.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
