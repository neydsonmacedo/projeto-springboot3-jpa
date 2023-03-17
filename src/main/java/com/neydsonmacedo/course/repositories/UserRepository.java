package com.neydsonmacedo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neydsonmacedo.course.entities.User;

public interface UserRepository extends JpaRepository<User,Long>{
	
	
}
