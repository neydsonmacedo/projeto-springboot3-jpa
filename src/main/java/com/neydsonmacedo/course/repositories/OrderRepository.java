package com.neydsonmacedo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neydsonmacedo.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order,Long>{
	
	
}
