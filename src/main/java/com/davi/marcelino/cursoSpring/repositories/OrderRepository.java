package com.davi.marcelino.cursoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davi.marcelino.cursoSpring.entities.Order;


public interface  OrderRepository extends JpaRepository<Order, Long>{
	
}
