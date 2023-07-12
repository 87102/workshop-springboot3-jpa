package com.davi.marcelino.cursoSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davi.marcelino.cursoSpring.entities.Product;
import com.davi.marcelino.cursoSpring.repositories.ProductRepository;

@Service
	public class ProductService {

	@Autowired
		private ProductRepository repository;

	public List<Product> fingAll() {
		return repository.findAll();
	}
	
	public Product findById(long id) {
	Optional<Product> obj = repository.findById(id);
	return obj.get();
	}
	
	
	
}
