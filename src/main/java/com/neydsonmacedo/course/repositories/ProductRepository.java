package com.neydsonmacedo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neydsonmacedo.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{
	
	
}
