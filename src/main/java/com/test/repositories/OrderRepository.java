package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
	
	
}
