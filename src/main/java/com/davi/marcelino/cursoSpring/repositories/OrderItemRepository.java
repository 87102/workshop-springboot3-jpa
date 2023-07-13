package com.davi.marcelino.cursoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davi.marcelino.cursoSpring.entities.OrderItem;
import com.davi.marcelino.cursoSpring.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
	
}
