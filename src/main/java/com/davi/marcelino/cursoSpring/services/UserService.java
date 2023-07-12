package com.davi.marcelino.cursoSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davi.marcelino.cursoSpring.entities.User;
import com.davi.marcelino.cursoSpring.repositories.UserRepository;

@Service
	public class UserService {

	@Autowired
		private UserRepository repository;

	public List<User> fingAll() {
		return repository.findAll();
	}
	
	public User findById(long id) {
	Optional<User> obj = repository.findById(id);
	return obj.get();
	}
	
	
	
}