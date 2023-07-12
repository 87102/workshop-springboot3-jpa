package com.davi.marcelino.cursoSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davi.marcelino.cursoSpring.entities.Order;
import com.davi.marcelino.cursoSpring.repositories.OrderRepository;

@Service
	public class OrderService {

	@Autowired
		private OrderRepository repository;

	public List<Order> fingAll() {
		return repository.findAll();
	}
	
	public Order findById(long id) {
	Optional<Order> obj = repository.findById(id);
	return obj.get();
	}
	
	
	
}
