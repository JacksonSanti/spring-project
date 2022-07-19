package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

	
	
	
}
