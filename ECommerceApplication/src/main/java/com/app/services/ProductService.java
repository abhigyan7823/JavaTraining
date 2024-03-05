package com.app.services;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.app.entites.Product;
import com.app.payloads.ProductDTO;

public interface ProductService {

	ProductDTO addProduct(Long categoryId, Product product);

	List<ProductDTO> getAllProducts();

	ProductDTO updateProduct(Long productId, Product product);

	ProductDTO updateProductImage(Long productId, MultipartFile image) throws IOException;

	String deleteProduct(Long productId);

}
