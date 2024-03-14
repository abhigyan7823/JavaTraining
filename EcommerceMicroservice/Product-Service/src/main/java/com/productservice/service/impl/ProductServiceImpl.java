package com.productservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.productservice.entity.Category;
import com.productservice.entity.Product;
import com.productservice.exception.APIException;
import com.productservice.exception.ResourceNotFoundException;
import com.productservice.repo.CategoryRepo;
import com.productservice.repo.ProductRepo;
import com.productservice.service.ProductService;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@Transactional
@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepo productRepo;

	@Autowired
	private CategoryRepo categoryRepo;

	@Value("${project.image}")
	private String path;
	
	@Override
	public Product addProduct(Long categoryId, @Valid Product product) {
		Category category = categoryRepo.findById(categoryId)
				.orElseThrow(() -> new ResourceNotFoundException("Category", "categoryId", categoryId));
		boolean isProductNotPresent = true;

		List<Product> products = category.getProducts();

		for (int i = 0; i < products.size(); i++) {
			if (products.get(i).getProductName().equals(product.getProductName())
					&& products.get(i).getDescription().equals(product.getDescription())) {

				isProductNotPresent = false;
				break;
			}
		}
		
		if (isProductNotPresent) {
			product.setImage("default.png");

			product.setCategory(category);

			double specialPrice = product.getPrice() - ((product.getDiscount() * 0.01) * product.getPrice());
			product.setSpecialPrice(specialPrice);

			Product savedProduct = productRepo.save(product);

			return savedProduct;
		} 
		else {
			throw new APIException("Product already exists !!!");
		}
	}

	@Override
	public List<Product> getAllProducts() {
		List<Product> products = productRepo.findAll();
	    if (products.isEmpty()) {
	        throw new APIException("No products found !!!");
	    }
	    return products;
	}

//	@Override
//	public Product updateProduct(Long productId, Product product) {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	@Override
//	public Product updateProductImage(Long productId, MultipartFile image) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public String deleteProduct(Long productId) {
		Product product = productRepo.findById(productId)
				.orElseThrow(() -> new ResourceNotFoundException("Product", "productId", productId));
		
//		To do
//		List<Cart> carts = cartRepo.findCartsByProductId(productId);
//
//		carts.forEach(cart -> cartService.deleteProductFromCart(cart.getCartId(), productId));

		productRepo.delete(product);

		return "Product with productId: " + productId + " deleted successfully !!!";
	}

}
