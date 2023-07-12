package com.davi.marcelino.cursoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davi.marcelino.cursoSpring.entities.Product;


public interface  ProductRepository extends JpaRepository<Product, Long>{
	
}
