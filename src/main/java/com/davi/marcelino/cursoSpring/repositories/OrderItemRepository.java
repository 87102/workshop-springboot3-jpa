package com.davi.marcelino.cursoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davi.marcelino.cursoSpring.entities.OrderItem;


public interface  OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
