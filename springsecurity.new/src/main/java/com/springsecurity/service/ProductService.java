package com.springsecurity.service;

import java.util.List;

import org.springframework.stereotype.Component;
import com.springsecurity.entity.Product;
import com.springsecurity.entity.UserInfo;

@Component
public interface ProductService {
	public void addProduct(Product pro);
	public List<Product> getProducts();
	public Product getProductById(int id);
}
