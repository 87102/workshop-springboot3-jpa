package com.davi.marcelino.cursoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davi.marcelino.cursoSpring.entities.User;

public interface  UserRepository extends JpaRepository<User, Long>{
	
}
