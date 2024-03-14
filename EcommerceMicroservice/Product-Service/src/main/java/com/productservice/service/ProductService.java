package com.productservice.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.productservice.entity.Product;

import jakarta.validation.Valid;

public interface ProductService {

	Product addProduct(Long categoryId, @Valid Product product);

	List<Product> getAllProducts();

//	Product updateProduct(Long productId, Product product);

//	Product updateProductImage(Long productId, MultipartFile image);

	String deleteProduct(Long productId);

}
