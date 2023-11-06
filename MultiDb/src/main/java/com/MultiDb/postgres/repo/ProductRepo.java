package com.MultiDb.postgres.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MultiDb.postgres.entities.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {
//	Product findByName(String title);
}
