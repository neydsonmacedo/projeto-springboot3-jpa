package com.neydsonmacedo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neydsonmacedo.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long>{
	
	
}
