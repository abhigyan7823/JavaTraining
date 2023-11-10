package com.springsecurity.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springsecurity.entity.Product;
@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
	public Product findByProductId(int id);
}
