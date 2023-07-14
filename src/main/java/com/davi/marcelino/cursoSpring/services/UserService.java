package com.davi.marcelino.cursoSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davi.marcelino.cursoSpring.entities.User;
import com.davi.marcelino.cursoSpring.repositories.UserRepository;
import com.davi.marcelino.cursoSpring.services.exceptions.ResourceNotFoundException;

@Service
	public class UserService {

	@Autowired
		private UserRepository repository;

	public List<User> fingAll() {
		return repository.findAll();
	}
	
	public User findById(long id) {
	Optional<User> obj = repository.findById(id);
	return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public void delete(long id) {
		repository.deleteById(id);
	}
	
	public User update(Long id, User obj) {
		User entity = repository.getReferenceById(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
		
	}
	
	
}
