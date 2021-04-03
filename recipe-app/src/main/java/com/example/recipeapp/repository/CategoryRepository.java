package com.example.recipeapp.repository;

import com.example.recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * Create by Kush on 03-04-2021
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
