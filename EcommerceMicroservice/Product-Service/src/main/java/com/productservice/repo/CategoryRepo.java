package com.productservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.productservice.entity.Category;

public interface CategoryRepo extends JpaRepository<Category, Long> {

	Category findByCategoryName(String categoryName);

}
