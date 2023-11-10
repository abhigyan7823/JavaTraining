package com.springsecurity.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springsecurity.entity.Product;
import com.springsecurity.repo.ProductRepo;
import com.springsecurity.repo.UserInfoRepo;
import com.springsecurity.service.ProductService;

@Service
public class ProductServiceImp implements ProductService {
	@Autowired
	UserInfoRepo userInfoRepo;
	@Autowired
	ProductRepo productRepo;
	
	
	@Override
	public List<Product> getProducts() {
		return productRepo.findAll();
	}
	
	@Override
	public Product getProductById(int id) {
		return productRepo.findByProductId(id);
	}

	@Override
	public void addProduct(Product pro) {
		productRepo.save(pro);
	}
	
}
