package com.productservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productservice.entity.Category;
import com.productservice.exception.APIException;
import com.productservice.exception.ResourceNotFoundException;
import com.productservice.repo.CategoryRepo;
import com.productservice.service.CategoryService;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;

@Service
@Transactional
@Log4j2
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	private CategoryRepo categoryRepo;
	
	@Override
	public Category createCategory(@Valid Category category) {
		log.info("CategoryServiceImpl's createCategory Method is Called");
		Category savedCategory = categoryRepo.findByCategoryName(category.getCategoryName());

		if (savedCategory != null) {
			throw new APIException("Category with the name '" + category.getCategoryName() + "' already exists !!!");
		}
		savedCategory = categoryRepo.save(category);
		return savedCategory;
	}

	@Override
	public List<Category> getCategories() {
		log.info("CategoryServiceImpl's getCategories Method is Called");
		List<Category> categories = categoryRepo.findAll();
		if(categories.isEmpty()) {
			throw new APIException("NO Categories Found");
		}
		return categories;
	}

	@Override
	public Category updateCategory(Category category, Long categoryId) {
		log.info("CategoryServiceImpl's updateCategory Method is Called");
		Category savedCategory = categoryRepo.findById(categoryId)
				.orElseThrow(() -> new ResourceNotFoundException("Category", "categoryId", categoryId));

		category.setCategoryId(categoryId);

		savedCategory = categoryRepo.save(category);

		return savedCategory;
	}

	@Override
	public String deleteCategory(Long categoryId) {
		log.info("CategoryServiceImpl's deleteCategory Method is Called");
		Category category = categoryRepo.findById(categoryId)
				.orElseThrow(() -> new ResourceNotFoundException("Category", "categoryId", categoryId));
//		TO DO
//		List<Product> products = category.getProducts();
//
//		products.forEach(product -> {
//			productService.deleteProduct(product.getProductId());
//		});
//		
		categoryRepo.delete(category);

		return "Category with categoryId: " + categoryId + " deleted successfully !!!";
	}

}
