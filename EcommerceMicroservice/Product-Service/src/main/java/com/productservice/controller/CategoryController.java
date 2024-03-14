package com.productservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productservice.entity.Category;
import com.productservice.service.CategoryService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@PostMapping("/admin/category")
	public ResponseEntity<Category> createCategory(@Valid @RequestBody Category category) {
		Category savedCategory = categoryService.createCategory(category);
		return new ResponseEntity<Category>(savedCategory, HttpStatus.CREATED);
	}

	@GetMapping("/public/categories")
	public ResponseEntity<List<Category>> getCategories() {
		
		List<Category> categories = categoryService.getCategories();

		return new ResponseEntity<List<Category>>(categories, HttpStatus.FOUND);
	}

	@PutMapping("/admin/categories/{categoryId}")
	public ResponseEntity<Category> updateCategory(@RequestBody Category category,
			@PathVariable Long categoryId) {
		Category category2 = categoryService.updateCategory(category, categoryId);

		return new ResponseEntity<Category>(category2, HttpStatus.OK);
	}

	@DeleteMapping("/admin/categories/{categoryId}")
	public ResponseEntity<String> deleteCategory(@PathVariable Long categoryId) {
		String status = categoryService.deleteCategory(categoryId);

		return new ResponseEntity<String>(status, HttpStatus.OK);
	}

}
