package com.springsecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springsecurity.entity.Product;
import com.springsecurity.service.ProductService;

@RestController
@RequestMapping("/products")
//@PreAuthorize("hasAuthority('ROLE_ADMIN')")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome Page";
	}
	
	@PostMapping("/new")
	public void addNewProduct(@RequestBody Product product) {
		productService.addProduct(product);
	}
	
	@GetMapping("/all")
	public List<Product> getAllProducts() {
		System.out.println("****** getAllProducts is called");
		return productService.getProducts();
	}
	
	@GetMapping("/{id}")
	public Product getProduct(@PathVariable int id) {
		return productService.getProductById(id);
	}
	
}
