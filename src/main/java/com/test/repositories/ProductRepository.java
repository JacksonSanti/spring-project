package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	
	
	
}
