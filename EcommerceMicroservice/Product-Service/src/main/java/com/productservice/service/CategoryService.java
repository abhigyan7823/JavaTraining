package com.productservice.service;

import java.util.List;

import com.productservice.entity.Category;

import jakarta.validation.Valid;

public interface CategoryService {

	Category createCategory(@Valid Category category);

	List<Category> getCategories();

	Category updateCategory(Category category, Long categoryId);

	String deleteCategory(Long categoryId);

}
