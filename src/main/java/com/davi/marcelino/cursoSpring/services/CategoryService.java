package com.davi.marcelino.cursoSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davi.marcelino.cursoSpring.entities.Category;
import com.davi.marcelino.cursoSpring.repositories.CategoryRepository;

@Service
	public class CategoryService {

	@Autowired
		private CategoryRepository repository;

	public List<Category> fingAll() {
		return repository.findAll();
	}
	
	public Category findById(long id) {
	Optional<Category> obj = repository.findById(id);
	return obj.get();
	}
	
	
	
}
